# Catalogo de Películas - Aplicación de Consola en Java

Este proyecto consiste en un catálogo de películas que simula la gestión de información almacenada en un archivo en el disco duro. La aplicación permite realizar operaciones como crear, listar, buscar y eliminar películas mediante una interfaz de consola interactiva.

## Introducción

El propósito de esta aplicación es proporcionar una manera sencilla de gestionar un catálogo de películas utilizando una interfaz de consola. Está desarrollada en Java utilizando JDK 17.0.8, con el IDE IntelliJ IDEA.

## Cómo utilizar

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en IntelliJ IDEA o tu IDE preferido.
3. Ejecuta la clase `PeliculaMain.java` ubicada en el paquete `laboratoriofinal`.
4. Sigue las instrucciones que se muestran en la consola para interactuar con las diferentes opciones del catálogo de películas.

## Tecnologías utilizadas

- Java JDK 17.0.8
- IntelliJ IDEA

## Arquitectura del proyecto

El proyecto sigue una arquitectura de capas:

- **Capa de dominio:** Contiene la clase `Pelicula`, que representa el modelo de datos a almacenar.

- **Capa de excepciones:** Maneja posibles errores con las clases `AccesoDatosEx`, `LecturaDatosEx` y `EscrituraDatosEx`.

- **Capa de datos:** Contiene la interfaz `AccesoDatos` que declara los métodos para operaciones de creación, agregación, listado, búsqueda y eliminación de datos. La clase `AccesoDatosImpl` implementa esta interfaz y contiene la lógica para manipular los datos del archivo.

- **Capa de negocio:** Define la interfaz `CatalogoPeliculas` que contiene las acciones a utilizar en el catálogo y su implementación (`CatalogoPeliculasImpl`). Esta última clase contiene la lógica para interactuar con los métodos de manipulación de datos.

- **Paquete de laboratoriofinal:** Contiene la clase `PeliculaMain`, encargada de crear la interfaz por consola para la interacción del usuario con las funcionalidades del catálogo de películas.

## Posibles mejoras

Algunas mejoras que podrían implementarse en el proyecto son:

- Persistencia de datos en una base de datos en lugar de utilizar un archivo en el disco duro.
- Ampliación de funcionalidades, como la clasificación de películas por género, director, año, etc.
- Mejoras en la interfaz de usuario para una mejor experiencia del usuario.

## Casos de uso

- Un usuario puede agregar una nueva película al catálogo.
- Se puede listar todas las películas disponibles en el catálogo.
- El usuario puede buscar una película por su título.
- Eliminar una película del catálogo.

¡Contribuciones son bienvenidas! Siéntete libre de mejorar este proyecto y agregar nuevas características.

¡Gracias por utilizar este catálogo de películas en consola desarrollado en Java!
