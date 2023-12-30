package com.peliculas.datos;

import com.peliculas.dominio.Pelicula;
import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.EscrituraDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;

import java.util.List;

/*Esta clase contiene las operaciones a ejecutar en el archivo de peliculas.txt*/
public interface AccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
