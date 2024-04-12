import Biblioteca.*;
import TiendaAnimales.*;

public class Main {
    public static void main(String[] args) {

        // TIENDA DE MASCOTAS
        // Instancia tienda
        TiendaMascotas tienda = new TiendaMascotas();
        // Instancia animales
        Perro perro = new Perro("Coco", 3, 2500, "Perro", "Caniche", true);
        Gato gato = new Gato("Rosita", 4, 3000, "Gato", "Siames", true);
        Pez pez = new Pez("Nemo", 1, 700, "Pez", "Salada");
        Ave ave = new Ave("Pedrito", 1, 1500, "Ave", "Loro", true);

        // Agregamos los animales a la tienda
        tienda.addMascotas(perro);
        tienda.addMascotas(gato);
        tienda.addMascotas(pez);
        tienda.addMascotas(ave);

        // Mostramos los animales de la tienda
        tienda.listarAnimales();

        // Alimentamos a un animal que existe y a otro que no
        tienda.alimentarAnimal("Coco");
        tienda.alimentarAnimal("Canela");

        // Vendemos mascota
        tienda.venderAnimal("Nemo");

        // Mostramos la tienda sin el animal vendido
        tienda.listarAnimales();

        // Alimentamos a una mascota desde el metodo de Animal
        // Uno que no existe
        perro.alimentar("Rosita");
        // Uno que si
        gato.alimentar("Rosita");

        System.out.println();
        System.out.println();

        // BIBLIOTECA
        // Creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca();
        // Creamos un libro de cada clase
        Novela novela = new Novela("Diario de una pasion","Nicholas Sparks",2004,"Novela romantica");
        Universitario universitario = new Universitario("Fisica Universitario", "Sears-Zemansky",1998,"Fisica");
        Infantil infantil = new Infantil("El Principito","Saint-Exupéry",1948,"Amor,amistad,perspectiva");

        // Agregamos los libros a la biblioteca
        biblioteca.addLibros(novela);
        biblioteca.addLibros(universitario);
        biblioteca.addLibros(infantil);

        // Mostramos los libros
        biblioteca.listarLibros();

        // Prestamos dos libros
        biblioteca.prestarLibro(novela);
        biblioteca.prestarLibro(universitario);

        // Vemos si cambio el estado de prestado
        biblioteca.listarLibros();

        // Intentamos prestar un libro ya prestado
        biblioteca.prestarLibro(novela);

        // Devolvemos un libro
        biblioteca.devolverLibro(universitario);
        biblioteca.listarLibros();

        // Prestamos y devolvemos un libro desde el metodo de la clase Libro
        infantil.prestar();
        novela.devolver();
        biblioteca.listarLibros();


    }
}