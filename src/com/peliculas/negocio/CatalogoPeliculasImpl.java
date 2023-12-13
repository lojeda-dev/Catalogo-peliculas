package com.peliculas.negocio;

import com.peliculas.datos.AccesoDatosImpl;

import java.io.FileNotFoundException;

/*Contiene las implementaciones de las operaciones necesarias de la aplicacion Catalogo Peliculas*/
public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    AccesoDatosImpl datos = new AccesoDatosImpl();

    public CatalogoPeliculasImpl() {
    }

    @Override
    public void agregar(String nombrePelicula, String nombreArchivo) {
    }

    @Override
    public void listar(String nombreArchivo) {
    }

    @Override
    public void buscar(String nombreArchivo, String buscar) {
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        datos.crear(nombreArchivo);
    }

}
