package TiendaAnimales;

import java.util.ArrayList;
import java.util.List;

public class TiendaMascotas {
    private List<Animal> animales;

    public TiendaMascotas() {
        animales = new ArrayList<>();
    }

    public void addMascotas(Animal animal) {
        animales.add(animal);
    }

    public void venderAnimal(String nombre) {
        int contador = 0;
        Animal animalGuardado = null;
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                contador++;
                animalGuardado = animal;
                break;
            }
        }
        if (contador != 0) {
            animales.remove(animalGuardado);
            System.out.println(nombre + " fue vendido.");
        } else {
            System.out.println("No se encontró un animal con ese nombre");
        }
    }

    public void alimentarAnimal(String nombre) {
        int contador = 0;
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                contador++;
                break;
            }
        }
        if (contador != 0) {
            System.out.println("Alimentando a " + nombre);
        } else {
            System.out.println("No se encontró un animal con ese nombre");
        }
    }

    public void listarAnimales(){
        System.out.println("\n------------------------Nuestras mascotas-----------------------------");
        for (Animal animal: animales) {
            System.out.println(animal);
        }
        System.out.println("-------------------------------------------------------------------------");
    }
}
