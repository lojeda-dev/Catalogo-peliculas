package com.peliculas.dominio;

/*Esta clase representa los objetos pelicula utilizados en la aplicaion de catalogo peliculas*/


public class Pelicula {
    private String nombre;

    public Pelicula(String nombrePelicula) {
        this.nombre = nombrePelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return this.nombre;
    }
}
