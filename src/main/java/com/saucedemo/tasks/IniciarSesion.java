package com.saucedemo.tasks;

import com.saucedemo.interactions.EsperaExplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.PaginaPrincipalUI.*;

public class IniciarSesion implements Task {

    String usuario, clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_LOGIN)
        );
    }

    public static IniciarSesion conCredenciales(String usuario, String clave){
        return Tasks.instrumented(IniciarSesion.class, usuario, clave);
    }
}
