package com.mycompany.bibliotecapoo;
import java.util.Scanner;
import java.util.LinkedList;

/**
*todo es de tiempo 0(1)
*a cepcion de mostrar libros y mostrar los libros no leidos
**/
public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1) Ingresar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación del libro: ");
                    int anoPublicacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el género del libro: ");
                    String genero = scanner.nextLine();

                    Libro nuevoLibro = new Libro(titulo, autor, anoPublicacion, genero);
                    biblioteca.registrarLibro(nuevoLibro);
                    System.out.println("Libro ingresado con éxito.");
                    break;

                case 2:
                    System.out.println("Todos los libros:");
                    biblioteca.mostrarLibros(); //timepo 0(N)
                    break;

                case 3:
                    System.out.print("Ingrese la palabra clave para buscar el libro: ");
                    String palabraBusqueda = scanner.nextLine();
                    Libro libroEncontrado = biblioteca.buscarLibro(palabraBusqueda);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println(libroEncontrado.mostrarInformacion());
                    } else {
                        System.out.println("No se encontró ningún libro con esa palabra clave.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el título del libro que desea marcar como leído: ");
                    String tituloLibroLeido = scanner.nextLine();
                    Libro libroLeido = biblioteca.buscarLibro(tituloLibroLeido);
                    if (libroLeido != null) {
                        libroLeido.marcarLeido();
                        System.out.println("Libro marcado como leído.");
                    } else {
                        System.out.println("No se encontró ningún libro con ese título.");
                    }
                    break;

                case 5:
                    System.out.println("Libros no leídos:");
                    biblioteca.mostrarLibrosNoLeidos(); //Tiempo 0(n)
                    break;

                case 6:
                    System.out.println("c errando el programa");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}