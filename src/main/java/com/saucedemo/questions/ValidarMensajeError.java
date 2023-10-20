package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.saucedemo.userinterfaces.PaginaPrincipalUI.LBL_ERROR;

public class ValidarMensajeError implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return LBL_ERROR.resolveFor(actor).getText();
    }

    public static ValidarMensajeError validar(){
        return new ValidarMensajeError();
    }
}
