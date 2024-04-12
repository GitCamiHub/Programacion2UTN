package AsociacionBi;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private List<Persona> personas;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.personas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    @Override
    public String toString() {
        return titulo;
    }

    public void agregarPropietarios(Persona persona){
       personas.add(persona);

    }

    public void mostrarPropietarios(){
        System.out.println("\nLas personas a la cuales pertenece " + "\"" + titulo + "\"" + " son: ");
        for (Persona per:personas) {
            System.out.println(per);
        }
    }
}
