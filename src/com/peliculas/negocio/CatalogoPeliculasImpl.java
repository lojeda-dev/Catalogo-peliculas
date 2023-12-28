package com.peliculas.negocio;

import com.peliculas.datos.AccesoDatosImpl;
import com.peliculas.dominio.Pelicula;
import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.EscrituraDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;
import lombok.NoArgsConstructor;

import java.io.FileNotFoundException;

/*Contiene las implementaciones de las operaciones necesarias de la aplicacion Catalogo Peliculas*/

@NoArgsConstructor
public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    AccesoDatosImpl datos = new AccesoDatosImpl();

    @Override
    public void agregar(String nombrePelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        datos.escribir(pelicula, nombreArchivo,anexar);
    }

    @Override
    public void listar(String nombreArchivo) throws LecturaDatosEx {
        datos.listar(nombreArchivo);
    }

    @Override
    public void buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        datos.buscar(nombreArchivo, buscar);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) throws AccesoDatosEx {
        datos.crear(nombreArchivo);
    }


    @Override
    public void borrar(String nombreArchivo, String nombrePelicula) throws AccesoDatosEx {
        datos.borrar(nombreArchivo, nombrePelicula);
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        datos.borrar(nombreArchivo);
    }

}
