package com.peliculas.laboratoriofinal;

import com.peliculas.negocio.CatalogoPeliculasImpl;

import java.util.Scanner;

/*Esta clase contiene el manu que permite al usuario seleccionar la accion a ejecutar sobre el catalago de peliculas*/

public class MainPelicula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombreArchivo;
        CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();

        System.out.println("Bienvenido al catalogo de peliculas:");
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1.- Iniciar catalogo de peliculas.\n" +
                    "2.- Agregar pelicula.\n" +
                    "3.- Listar peliculas.\n" +
                    "4.- Buscar pelicula.\n" +
                    "0.- Salir");
            opcion = entrada.nextInt();
        } while (opcion > 4 || opcion < 0);

        switch (opcion){

            case 1: catalogo.iniciarArchivo("pelicula/txt");


        }
    }
}