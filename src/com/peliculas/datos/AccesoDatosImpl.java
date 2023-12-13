package com.peliculas.datos;

import com.peliculas.dominio.Pelicula;
import com.peliculas.excepciones.AccesoDatosEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) {
        return false;
    }

    @Override
    public List<Pelicula> listar() {
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        return null;
    }

    @Override
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo correctamente.");
        } catch (FileNotFoundException e) {
            throw new AccesoDatosEx();
        }

    }

    @Override
    public void borrar(String nombreArchivo) {
    }
}
