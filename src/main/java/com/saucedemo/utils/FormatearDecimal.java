package com.saucedemo.utils;

import java.text.DecimalFormat;

public class FormatearDecimal {

    Double valor;

    public FormatearDecimal(Double valor) {
        this.valor = valor;
    }

    public static String format(Double valor){
        DecimalFormat df = new DecimalFormat("#.##");

        return df.format(valor).replace(",", ".");
    }
}
