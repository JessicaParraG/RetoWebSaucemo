package com.saucedemo.interactions;

import com.saucedemo.utils.FormatearDecimal;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.saucedemo.userinterfaces.CarritoUI.LBL_PRECIO;
import static com.saucedemo.utils.WebDriverFactory.driver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarTotal implements Interaction {

    double precio1, precio2, tax;
    public static double totals;

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> precios = LBL_PRECIO.resolveAllFor(actor);
        precio1 = Double.parseDouble(precios.get(0).getText().replace("$", ""));
        precio2 = Double.parseDouble(precios.get(1).getText().replace("$", ""));

        WebElement contenedor = driver.findElement(By.id("checkout_summary_container"));
        WebElement elemento = contenedor.findElement(By.className("summary_tax_label"));

        tax = Double.parseDouble(elemento.getText().replace("Tax: $", ""));

        totals = (precio1 + precio2 + tax);

        WebElement element = driver.findElement(By.xpath(" //*[contains(text(), 'Total: $')]"));
        String total = element.getText().replace("Total: $", "");

        actor.attemptsTo(
                Ensure.that(FormatearDecimal.format(totals)).contains(total)
        );
    }
    public static ValidarTotal deCompra() {
        return instrumented(ValidarTotal.class);
    }
}
