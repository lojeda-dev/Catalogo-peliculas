package com.peliculas.dominio;

/*Esta clase representa los objetos pelicula utilizados en la aplicaion de catalogo peliculas*/
public class Pelicula {
    private String nombre;

    public Pelicula(){}
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
