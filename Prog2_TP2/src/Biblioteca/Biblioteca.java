package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void addLibros(Libro libro) {
        libros.add(libro);
    }

    public void prestarLibro(Libro libro) {
        if (!libro.isPrestado()) {
            System.out.println("El libro " + libro.getTitulo() + " está disponible.");
            libro.setPrestado(true);
        } else {
            System.out.println("El libro " + libro.getTitulo() + " está prestado.");
        }
    }

    public void devolverLibro(Libro libro) {
        libro.setPrestado(false);
        System.out.println("Gracias por devolver el libro en tiempo y forma.");
    }

    public void listarLibros() {
        System.out.println("\n----------------BIBLIOTECA------------------");
        for (Libro libro : libros) {
            System.out.println(libro);
            System.out.println("-------------------------------------------");
        }
    }
}
