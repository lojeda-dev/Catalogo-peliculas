package com.peliculas.negocio;

import com.peliculas.datos.AccesoDatos;
import com.peliculas.datos.AccesoDatosImpl;
import com.peliculas.dominio.Pelicula;
import com.peliculas.excepciones.AccesoDatosEx;

/*Contiene las implementaciones de las operaciones necesarias de la aplicacion Catalogo Peliculas*/


public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula,NOMBRE_RECURSO,anexar);
        } catch (AccesoDatosEx e) {
            System.out.println("ERROR ACCESO A DATOS");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (var p: peliculas) {
                System.out.println(p);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("ERROR ACCESO DATOS");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO,buscar);

        } catch (AccesoDatosEx e) {
            System.out.println("ERROR ACCESO DATOS");
            e.printStackTrace(System.out);
        }
        System.out.println(resultado);

    }

    @Override
    public void iniciarCatalogo() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("ERROR AL INICIAR CATALOGO DE PELICULAS");
            e.printStackTrace(System.out);
        }
    }
}
