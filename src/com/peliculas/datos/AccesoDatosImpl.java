package com.peliculas.datos;

import com.peliculas.dominio.Pelicula;
import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.EscrituraDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        if (existe(nombreArchivo)) {
            var archivo = new File(nombreArchivo);
            List<Pelicula> peliculas = new ArrayList<>();
            try {
                var entrada = new BufferedReader(new FileReader(archivo));
                String lectura = entrada.readLine();
                while (lectura != null) {
                    Pelicula pelicula = new Pelicula(lectura);
                    peliculas.add(pelicula);
                    lectura = entrada.readLine();
                }
                entrada.close();
                return peliculas;
            } catch (IOException e) {
                throw new LecturaDatosEx("No se pudo listar peliculas." + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe.");
            return null;
        }
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        if (existe(nombreArchivo)) {
            var archivo = new File(nombreArchivo);
            try {
                var salida = new PrintWriter(new FileWriter(archivo, anexar));
                salida.println(pelicula.toString());
                salida.close();
                System.out.println("Se ha escrito el archivo correctamente.");
            } catch (IOException e) {
                throw new EscrituraDatosEx("No se pudo escribir la pelicula." + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe.");
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        String resultado = null;
        if (existe(nombreArchivo)) {
            var archivo = new File(nombreArchivo);
            try {
                var entrada = new BufferedReader(new FileReader(archivo));
                String lectura = entrada.readLine();
                int i = 1;
                while (lectura != null) {
                    if (lectura.equalsIgnoreCase(buscar)) {
                        resultado = "Pelicula = " + lectura + ". ID = " + i;
                        break;
                    } else {
                        lectura = entrada.readLine();
                        i++;
                    }
                }
                entrada.close();
            } catch (IOException e) {
                throw new LecturaDatosEx("No se pudo leer el archivo." + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe.");
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        if (existe(nombreArchivo)) {
            System.out.println("El archivo ya existe.");
        } else {
            var archivo = new File(nombreArchivo);
            try {
                var salida = new PrintWriter(archivo);
                salida.close();
                System.out.println("Se ha creado el archivo correctamente.");
            } catch (IOException e) {
                throw new AccesoDatosEx("No se pudo crear el archivo." + e.getMessage());
            }
        }
    }

    @Override
    public void borrar(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Se borro el archivo correctamente.");
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
