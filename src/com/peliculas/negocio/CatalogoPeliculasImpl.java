package com.peliculas.negocio;

import com.peliculas.datos.AccesoDatosImpl;
import com.peliculas.dominio.Pelicula;
import lombok.NoArgsConstructor;

import java.io.FileNotFoundException;

/*Contiene las implementaciones de las operaciones necesarias de la aplicacion Catalogo Peliculas*/

@NoArgsConstructor
public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    AccesoDatosImpl datos = new AccesoDatosImpl();

    @Override
    public void agregar(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        datos.escribir(pelicula, nombreArchivo);
    }

    @Override
    public void listar(String nombreArchivo) {
        datos.listar(nombreArchivo);
    }

    @Override
    public void buscar(String nombreArchivo, String buscar) {
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        datos.crear(nombreArchivo);
    }

    @Override
    public void borrar(String nombreArchivo) {

    }

    @Override
    public void borrar(String nombreArchivo, String nombrePelicula) {

    }

}
