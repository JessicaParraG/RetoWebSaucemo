package com.saucedemo.stepsdefinitions;

import com.saucedemo.questions.ValidarMensajeError;
import io.cucumber.java.Before;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginFallidoStepsDefinition {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Entonces("el visualizara un mensaje de error")
    public void elVisualizaraUnMensajeDeError() {
        OnStage.theActorInTheSpotlight().should(seeThat("Validar Mensaje Error", ValidarMensajeError.validar(), Matchers.containsString("Epic sadface: Username and password do not match any user in this service")));
    }
}
