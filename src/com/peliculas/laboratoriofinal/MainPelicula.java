package com.peliculas.laboratoriofinal;

import com.peliculas.negocio.CatalogoPeliculasImpl;

import java.util.Scanner;

/*Esta clase contiene el manu que permite al usuario seleccionar la accion a ejecutar sobre el catalago de peliculas*/

public class MainPelicula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombreArchivo = "";
        String nombrePelicula = "";
        CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();

        System.out.println("Bienvenido al catalogo de peliculas:");
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1.- Iniciar catalogo de peliculas.\n" +
                    "2.- Agregar pelicula.\n" +
                    "3.- Listar peliculas.\n" +
                    "4.- Buscar pelicula.\n" +
                    "5.- Borrar pelicula.\n" +
                    "5.- Borrar catalogo.\n" +
                    "0.- Salir");
            opcion = entrada.nextInt();
        } while (opcion > 4 || opcion < 0);
        Scanner ent = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese nombre del catalogo: ");
                nombreArchivo = ent.nextLine();
                System.out.println(nombreArchivo);
                /*catalogo.iniciarArchivo(nombreArchivo);*/
                break;
            case 2:
                System.out.println("Ingrese nombre de la pelicula a agregar: ");
                nombrePelicula = ent.nextLine();
                System.out.println(nombrePelicula);
                /*catalogo.agregar(nombrePelicula,"peliculas.txt");*/
                break;
        }
    }
}