package com.peliculas.negocio;

/*Esta clase contien las operaciones necesarias de la aplicacion catalogo peliculas*/

import java.io.FileNotFoundException;

public interface CatalogoPeliculas {

    void agregar(String nombrePelicula, String nombreArchivo);

    void listar(String nombreArchivo) throws FileNotFoundException;

    void buscar(String nombreArchivo, String buscar);

    void iniciarArchivo(String nombreArchivo);

    void borrar(String nombreArchivo);

    void borrar(String nombreArchivo, String nombrePelicula);


}
