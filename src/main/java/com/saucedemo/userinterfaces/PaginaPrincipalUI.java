package com.saucedemo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class PaginaPrincipalUI extends PageObject {

    public static final Target TXT_USUARIO = Target.the("").located(By.id("user-name"));
    public static final Target TXT_CLAVE = Target.the("").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("").located(By.id("login-button"));
    public static final Target LBL_ERROR = Target.the("").located(By.xpath("//h3[@data-test='error']"));
}
