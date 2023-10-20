package com.saucedemo.tasks;

import com.saucedemo.interactions.EsperaExplicita;
import com.saucedemo.interactions.SeleccionarProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.userinterfaces.ProductosUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LST_ORDEN),
                WaitUntil.the(OP_MENOR_A_MAYOR, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OP_MENOR_A_MAYOR),
                SeleccionarProductos.aleatoriamente(),
                Click.on(BTN_CARRITO)
        );
    }

    public static AgregarProductos alCarrito(){
        return Tasks.instrumented(AgregarProductos.class);
    }
}
