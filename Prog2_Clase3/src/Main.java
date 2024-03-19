import Clases.Directivo;
import Clases.Oficial;
import Clases.Operario;
import Clases.Tecnico;

public class Main {
    public static void main(String[] args) {
        Operario operario1 = new Operario("Matias",11589);
        Oficial oficial1 = new Oficial("Valeria",11478,"Admistrativo");
        Tecnico tecnico1 = new Tecnico("Dario",12589,"Informatica");
        Directivo direc1 = new Directivo("Claudia","Ventas");

        System.out.println(operario1);
        System.out.println("-----------------------------------------");
        operario1.hablar();
        System.out.println("-----------------------------------------");
        System.out.println(oficial1);
        System.out.println("-----------------------------------------");
        oficial1.hablar();
        System.out.println("-----------------------------------------");
        System.out.println(tecnico1);
        System.out.println("-----------------------------------------");
        System.out.println(direc1);
        System.out.println("-----------------------------------------");
        direc1.darOrden();

    }
}