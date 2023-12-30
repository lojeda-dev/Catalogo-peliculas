package com.peliculas.laboratoriofinal;

import com.peliculas.negocio.CatalogoPeliculas;
import com.peliculas.negocio.CatalogoPeliculasImpl;

import java.util.Scanner;

/*Esta clase contiene el manu que permite al usuario seleccionar la accion a ejecutar sobre el catalago de peliculas*/

public class MainPelicula {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var opcion = -1;
        CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        System.out.println("Bienvenido al catalogo de peliculas");
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1.- Iniciar catalogo de peliculas.\n" +
                    "2.- Agregar pelicula.\n" +
                    "3.- Listar peliculas.\n" +
                    "4.- Buscar pelicula.\n" +
                    "0.- Salir");
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por utilizar nuestra aplicacion");
                    break;
                case 1:
                    catalogo.iniciarCatalogo();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    String nombrePelicula = entrada.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingrese nombre de la pelicula a bsucar: ");
                    String nombreBuscar = entrada.nextLine();
                    catalogo.buscarPelicula(nombreBuscar);
                    break;
                default:
                    System.out.println("ERROR! OPCION NO RECONOCIDA");
                    break;
            }
        } while (opcion != 0);
    }
}