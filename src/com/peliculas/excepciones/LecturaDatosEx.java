package com.peliculas.excepciones;

public class LecturaDatosEx extends RuntimeException {
    public LecturaDatosEx() {
        System.out.println("No se pudo leer el archivo.");
    }
}
