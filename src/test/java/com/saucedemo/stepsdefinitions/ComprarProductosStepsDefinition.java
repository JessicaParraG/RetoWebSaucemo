package com.saucedemo.stepsdefinitions;

import com.saucedemo.questions.ValidarMensaje;
import com.saucedemo.tasks.AgregarProductos;
import com.saucedemo.tasks.Hacer;
import com.saucedemo.tasks.IniciarSesion;
import com.saucedemo.utils.WebDriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComprarProductosStepsDefinition {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa a la pagina (.*)$")
    public void queElUsuarioIngresaALaPagina(String url) {
        OnStage.theActorCalled("brandon").can(BrowseTheWeb.with(WebDriverFactory.goToWeb(url)));
    }

    @Cuando("^el ingrese las credenciales (.*) (.*)$")
    public void elIngreseLasCredenciales(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.conCredenciales(usuario, clave));
    }
    @Cuando("^el seleccione los productos que desea comprar (.*)$")
    public void elSeleccioneLosProductosQueDeseaComprar(String accion) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarrito());
        OnStage.theActorInTheSpotlight().attemptsTo(Hacer.checkout(accion));
    }
    @Entonces("el validara un mensaje de compra exitosa")
    public void elValidaraUnMensajeDeCompraExitosa() {
        OnStage.theActorInTheSpotlight().should(seeThat("Validar Mensaje", ValidarMensaje.validar(), Matchers.containsString("Thank you for your order!")));
    }
}
