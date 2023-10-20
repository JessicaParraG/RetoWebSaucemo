package com.saucedemo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target BTN_REMOVER = Target.the("").located(By.xpath("(//button[text()='Remove'])[3]"));
    public static final Target LBL_PRECIO = Target.the("").located(By.xpath("//div[@class='inventory_item_price']"));
    public static final Target BTN_CHECKOUT = Target.the("").located(By.id("checkout"));
    public static final Target TXT_NOMBRE = Target.the("").located(By.id("first-name"));
    public static final Target TXT_APELLIDO = Target.the("").located(By.id("last-name"));
    public static final Target TXT_CODIGO_ZIP = Target.the("").located(By.id("postal-code"));
    public static final Target BTN_CONTINUAR = Target.the("").located(By.id("continue"));
    public static final Target LBL_PRODUCTOS = Target.the("").located(By.className("shopping_cart_badge"));
    public static Target LBL_VALIDAR_CANTIDAD(String cantidad) {
        return Target.the("").located(By.xpath("//span[contains(text(),'" + cantidad + "')]"));
    }
}
