package com.peliculas.negocio;

/*Esta clase contien las operaciones necesarias de la aplicacion catalogo peliculas*/

import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.EscrituraDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;

import java.io.FileNotFoundException;

public interface CatalogoPeliculas {
    String NOMBRE_RECURSO = "peliculas.txt";

    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();

    void buscarPelicula(String buscar);

    void iniciarCatalogo();
}
