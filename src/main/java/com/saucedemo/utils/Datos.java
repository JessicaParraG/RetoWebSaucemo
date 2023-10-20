package com.saucedemo.utils;

import com.github.javafaker.Faker;

public class Datos {
    static Faker faker = new Faker();

    private String nombre;
    private String apellido;
    private String codigoZip;

    public Datos() {
        //Datos aleatorios
        this.nombre = faker.name().firstName();
        this.apellido = faker.name().lastName();
        this.codigoZip = String.valueOf(faker.number().digits(5));
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCodigoZip() {
        return codigoZip;
    }
}
