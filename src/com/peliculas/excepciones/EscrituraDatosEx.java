package com.peliculas.excepciones;

public class EscrituraDatosEx extends RuntimeException {
    public EscrituraDatosEx() {
        System.out.println("No se pudo escribir el archivo.");
    }
}
