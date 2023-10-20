package com.saucedemo.stepsdefinitions;

import com.saucedemo.questions.ValidarMensajeError;
import io.cucumber.java.Before;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CompraIncompletaStepsDefinitions {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Entonces("visualizara un mensaje de informacion obligatoria")
    public void visualizaraUnMensajeDeInformacionObligatoria() {
        OnStage.theActorInTheSpotlight().should(seeThat("Validar Mensaje Informacion Obligatoria", ValidarMensajeError.validar(), Matchers.containsString("Error: First Name is required")));
    }
}
