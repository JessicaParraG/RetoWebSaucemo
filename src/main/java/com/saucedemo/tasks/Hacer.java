package com.saucedemo.tasks;

import com.saucedemo.interactions.ValidarProductos;
import com.saucedemo.interactions.ValidarTotal;
import com.saucedemo.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.userinterfaces.CarritoUI.*;
import static com.saucedemo.userinterfaces.CheckoutUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Hacer implements Task {

    Datos datos = new Datos();
    String accion;

    public Hacer(String accion) {
        this.accion = accion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (accion){
            case "Compra completa": {
                actor.attemptsTo(
                        Click.on(BTN_REMOVER),
                        Click.on(BTN_CHECKOUT),
                        Enter.theValue(datos.getNombre()).into(TXT_NOMBRE),
                        Enter.theValue(datos.getApellido()).into(TXT_APELLIDO),
                        Enter.theValue(datos.getCodigoZip()).into(TXT_CODIGO_ZIP),
                        Click.on(BTN_CONTINUAR),
                        WaitUntil.the(LBL_PRODUCTOS, isVisible()).forNoMoreThan(10).seconds(),
                        ValidarProductos.deCompra(),
                        ValidarTotal.deCompra(),
                        Click.on(BTN_FINALIZAR)
                );
                break;
            }
            case "Compra incompleta": {
                actor.attemptsTo(
                        Click.on(BTN_CHECKOUT),
                        Enter.theValue(datos.getApellido()).into(TXT_APELLIDO),
                        Enter.theValue(datos.getCodigoZip()).into(TXT_CODIGO_ZIP),
                        Click.on(BTN_CONTINUAR)
                );
                break;
            }
            default:
        }
    }
    public static Hacer checkout(String accion) {
        return Tasks.instrumented(Hacer.class, accion);
    }
}
