package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.saucedemo.userinterfaces.CheckoutUI.LBL_COMPRA_EXITOSA;

public class ValidarMensaje implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return LBL_COMPRA_EXITOSA.resolveFor(actor).getText();
    }

    public static Question<String> validar(){
        return new ValidarMensaje();
    }
}
