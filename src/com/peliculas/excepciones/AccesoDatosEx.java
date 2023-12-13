package com.peliculas.excepciones;

public class AccesoDatosEx extends RuntimeException{

    public AccesoDatosEx() {
        System.out.println("No se pudo crear el archivo.");
    }
}
