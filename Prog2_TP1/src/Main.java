import Punto10.LibrosDeTexto;
import Punto10.LibrosDeTextoUNCol;
import Punto10.Novelas;
import Punto8.Gerente;
import Punto8.Trabajador;
import Punto9.Circulo;
import Punto9.Rectangulo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Punto 8
        System.out.println("--- PUNTO 8 ---");
        // Instancias
        Gerente empleado1 = new Gerente("Marcela Perez",50,520000,"Marketing");
        Trabajador empleado2 = new Trabajador("Lucas Guerrero",27,360000,"Diseño");
        // Gerente metodos
        System.out.println(empleado1.toString());
        System.out.println();
        empleado1.organizarDepartamento();
        System.out.println();
        // Trabajador metodos
        System.out.println(empleado2.toString());
        System.out.println();
        empleado2.producirEnArea();
        System.out.println("--------------------------------------------------------------");

        // Punto 9
        System.out.println("--- PUNTO 9 ---");
        // Instancias
        Circulo circulo1 = new Circulo(5.2);
        Rectangulo rec1 = new Rectangulo(5,2);
        // Circulo metodos
        System.out.println("Circulo de radio " + circulo1.getRadio());
        System.out.println("Area = " + circulo1.calcularArea());
        System.out.println("Perimetro = " + circulo1.calcularPerimetro());
        // Rectangulo metodos
        System.out.println("\nRectangulo de base " + rec1.getBase() + " y altura " + rec1.getAltura());
        System.out.println("Area = " + rec1.calcularArea());
        System.out.println("Perimetro = " + rec1.calcularPerimetro());
        System.out.println("--------------------------------------------------------------");

        // Punto 10
        System.out.println("--- PUNTO 10 ---");
        // Instancias
        LibrosDeTexto libroTexto = new LibrosDeTexto("Lengua extranjera","Gabriel Lopez", 4526.76,"Literatura");
        LibrosDeTextoUNCol libroUNCol = new LibrosDeTextoUNCol("Integrales", "Marta Bonanza",5146.52,"Analisis 1","Ingenieria");
        Novelas novela = new Novelas("Historia de una herencia","Pilcher",3594.99,"Romantica");
        // Metodo toString()
        System.out.println(libroTexto.getClass().getSimpleName());
        System.out.println(libroTexto);
        System.out.println();
        System.out.println(libroUNCol.getClass().getSimpleName());
        System.out.println(libroUNCol);
        System.out.println();
        System.out.println(novela.getClass().getSimpleName());
        System.out.println(novela);



    }
}