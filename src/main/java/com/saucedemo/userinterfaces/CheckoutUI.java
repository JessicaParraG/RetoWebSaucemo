package com.saucedemo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutUI {

    public static final Target BTN_FINALIZAR = Target.the("").located(By.xpath("//*[@id='finish']"));
    public static final Target LBL_COMPRA_EXITOSA = Target.the("").located(By.xpath("//*[@class='complete-header']"));
}
