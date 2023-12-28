package com.peliculas.datos;

import com.peliculas.dominio.Pelicula;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/*Esta clase contiene las operaciones a ejecutar en el archivo de peliculas.txt*/
public interface AccesoDatos {
    boolean existe(String nombreArchivo);

    void listar(String nombreArchivo);

    void escribir(Pelicula pelicula, String nombreArchivo);

    String buscar(String nombreArchivo, String buscar);

    void crear(String nombreArchivo);

    void borrar(String nombreArchivo);

    void borrar(String nombreArchivo,String nombrePelicula);
}
