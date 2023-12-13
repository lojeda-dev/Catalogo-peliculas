package com.peliculas.negocio;

/*Esta clase contien las operaciones necesarias de la aplicacion catalogo peliculas*/

public interface CatalogoPeliculas {

    void agregar(String nombrePelicula, String nombreArchivo);

    void listar(String nombreArchivo);

    void buscar(String nombreArchivo, String buscar);

    void iniciarArchivo(String nombreArchivo);
}
