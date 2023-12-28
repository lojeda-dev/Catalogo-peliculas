package com.peliculas.negocio;

/*Esta clase contien las operaciones necesarias de la aplicacion catalogo peliculas*/

import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.EscrituraDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;

import java.io.FileNotFoundException;

public interface CatalogoPeliculas {

    void agregar(String nombrePelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    void listar(String nombreArchivo) throws LecturaDatosEx;

    void buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    void iniciarArchivo(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo, String nombrePelicula) throws AccesoDatosEx;
    void borrar(String nombreArchivo) throws AccesoDatosEx;


}
