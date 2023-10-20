package com.saucedemo.utils;

import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

public class Constantes {

    public static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();

    public static final String DEFAULT_BROWSER = CONF.getProperty("config.browser.default");
    public static final String EDGE = "Edge";
    public static final String CHROME = "Chrome";
    public static final String FIREFOX = "Firefox";
}
