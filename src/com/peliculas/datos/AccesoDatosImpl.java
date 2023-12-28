package com.peliculas.datos;

import com.peliculas.dominio.Pelicula;
import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.EscrituraDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.List;

@NoArgsConstructor
public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        return false;
    }

    @Override
    public void listar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException e) {
            throw new LecturaDatosEx();
        }
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        String nombrePelicula = pelicula.getNombre();
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(nombrePelicula);
            salida.close();
            System.out.println("Se ha escrito el archivo correctamente.");
        } catch (IOException e) {
            throw new EscrituraDatosEx();
        }
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

    @Override
    public void borrar(String nombreArchivo, String nombrePelicula) {

    }
}
