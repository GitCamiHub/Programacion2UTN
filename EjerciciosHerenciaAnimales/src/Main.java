import Clases.Gato;
import Clases.Pajaro;
import Clases.Perro;

public class Main {
    public static void main(String[] args) {
        // Instancias
        Perro perro = new Perro("Coco",8,"Macho","Caniche");
        Pajaro pajaro = new Pajaro("Elvira",2,"Hembra","Colibri");
        Gato gato = new Gato("German", 6,"Hembra","Largo");

        // Prueba de metodos
        System.out.println();
        perro.informacion();
        perro.hacerSonido();
        System.out.println("---------------------");
        pajaro.informacion();
        pajaro.hacerSonido();
        System.out.println("---------------------");
        gato.informacion();
        gato.hacerSonido();




    }
}