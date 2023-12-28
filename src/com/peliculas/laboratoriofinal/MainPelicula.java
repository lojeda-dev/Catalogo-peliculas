package com.peliculas.laboratoriofinal;

import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.EscrituraDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;
import com.peliculas.negocio.CatalogoPeliculasImpl;

import java.util.Scanner;

/*Esta clase contiene el manu que permite al usuario seleccionar la accion a ejecutar sobre el catalago de peliculas*/

public class MainPelicula {
    public static void main(String[] args) throws AccesoDatosEx {
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
                    "6.- Borrar catalogo.\n" +
                    "0.- Salir");
            opcion = entrada.nextInt();
        } while (opcion > 6 || opcion < 0);
        Scanner ent = new Scanner(System.in);
        switch (opcion) {
            case 0:
                System.out.println("Gracias por utilizar nuestra plataforma.");
                break;
            case 1:
                System.out.println("Ingrese nombre del catalogo: ");
                nombreArchivo = ent.nextLine();
                catalogo.iniciarArchivo(nombreArchivo);
                break;
            case 2:
                boolean anexar = true;
                System.out.println("Ingrese nombre de la pelicula a agregar: ");
                nombrePelicula = ent.nextLine();
                catalogo.agregar(nombrePelicula, "peliculas.txt",anexar);
                break;
            case 3:
                catalogo.listar("peliculas.txt");
                break;
            case 4:
                System.out.println("Ingrese el nombre de la pelicula a buscar: ");
                String nombre = ent.nextLine();
                catalogo.buscar("peliculas.txt", nombre);
                break;
            case 5:
                System.out.println("Ingrese el nombre de la pelicula a borrar: ");
                String nombreBorrar = ent.nextLine();
                catalogo.borrar("peliculas.txt", nombreBorrar);
                break;
            case 6:
                System.out.println("Ingrese el nombre del catalogo a borrar: ");
                String n = ent.nextLine();
                catalogo.borrar(n);
                break;

        }
    }
}