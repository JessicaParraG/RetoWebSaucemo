package com.saucedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.saucedemo.userinterfaces.CarritoUI.LBL_PRODUCTOS;
import static com.saucedemo.userinterfaces.CarritoUI.LBL_VALIDAR_CANTIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarProductos implements Interaction {

    public static String cantidadProductos;

    @Override
    public <T extends Actor> void performAs(T actor) {

        cantidadProductos = LBL_PRODUCTOS.resolveFor(actor).getText();

        actor.attemptsTo(
                Ensure.that(cantidadProductos).contains(LBL_VALIDAR_CANTIDAD(cantidadProductos).resolveFor(actor).getText())
        );

    }
    public static ValidarProductos deCompra() {
        return instrumented(ValidarProductos.class);
    }
}
