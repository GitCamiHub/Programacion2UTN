package AsociacionBi;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<Libro>libros;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void agregarLibros(Libro libro){
        libros.add(libro);
        libro.agregarPropietarios(this);
    }

    public void mostrarLibros(){
        System.out.println("\nLos libros de " + nombre + " son: ");
        for (Libro libro:libros) {
            System.out.println(libro);
        }
    }
}
