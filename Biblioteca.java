package com.mycompany.bibliotecapoo;
import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Libro> libros;

    public Biblioteca() {
        this.libros = new LinkedList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     *linkedlist, biblioteca y registar libro son de tiempo 0(1)
     *
     */

    public Libro buscarLibro(String palabraBusqueda) { //esto es de tiempo 0(N)
        for (Libro libro : libros) {
            if (libro.mostrarInformacion().toLowerCase().contains(palabraBusqueda.toLowerCase())) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibros() { //tiempo 0(n)
        for (Libro libro : libros) {
            System.out.println(libro.mostrarInformacion());
        }
    }

    public void mostrarLibrosNoLeidos() { //timepo 0(n)
        for (Libro libro : libros) {
            if (!libro.isLeido()) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }
}
