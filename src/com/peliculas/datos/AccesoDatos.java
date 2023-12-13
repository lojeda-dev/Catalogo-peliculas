package com.peliculas.datos;

import com.peliculas.dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

/*Esta clase contiene las operaciones a ejecutar en el archivo de peliculas.txt*/
public interface AccesoDatos {
    boolean existe(String nombreArchivo);

    List<Pelicula> listar();

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);

    String buscar(String nombreArchivo, String buscar);

    void crear(String nombreArchivo);

    void borrar(String nombreArchivo);
}
