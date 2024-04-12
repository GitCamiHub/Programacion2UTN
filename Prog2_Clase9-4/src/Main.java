import Agregacion.Departamento;
import Agregacion.Empleado;
import Agregacion.Empresa;
import AsociacionBi.Libro;
import AsociacionBi.Persona;
import AsociacionUni.Estudiante;
import AsociacionUni.Universidad;
import Composicion.Casa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Asociacion unidireccional
        System.out.println("\n----------------Asociacion unidireccional--------------------\n");
        Universidad u1 = new Universidad("Universidad Tecnologica Nacional");
        Universidad u2 = new Universidad("Universidad Nacional de Cuyo");

        Estudiante estudiante1 = new Estudiante("Marcos Perez",u1);
        Estudiante estudiante2 = new Estudiante("Camila Becerra",u2);

        System.out.println(estudiante1.getNombre() + " estudia en " + estudiante1.verUniversidad());
        System.out.println(estudiante2.getNombre() + " estudia en " + estudiante2.verUniversidad());
        // Cambio de universidad
        estudiante1.cambiarUniversidad(u2);
        estudiante2.cambiarUniversidad(u1);

        System.out.println(estudiante1.getNombre() + " estudia en " + estudiante1.verUniversidad());
        System.out.println(estudiante2.getNombre() + " estudia en " + estudiante2.verUniversidad());

        System.out.println();

        // Asociacion bidireccional
        System.out.println("\n----------------Asociacion bidireccional--------------------\n");

        Persona p1 = new Persona("Daniel");
        Persona p2 = new Persona("Lewis");
        Persona p3 = new Persona("Max");
        Persona p4 = new Persona("Valteri");
        Persona p5 = new Persona("Carlos");
        Persona p6 = new Persona("Sergio");

        Libro l1 = new Libro("El señor de los anillos");
        Libro l2 = new Libro("Harry Potter");
        Libro l3 = new Libro("Juego de tronos");
        Libro l4 = new Libro("Los juegos del hambre");

        p1.agregarLibros(l1);
        p1.agregarLibros(l4);
        p1.agregarLibros(l2);

        p2.agregarLibros(l3);
        p2.agregarLibros(l4);
        p2.agregarLibros(l2);

        p3.agregarLibros(l1);
        p3.agregarLibros(l4);

        p4.agregarLibros(l3);

        p5.agregarLibros(l2);
        p5.agregarLibros(l3);
        p5.agregarLibros(l1);

        p6.agregarLibros(l2);
        p6.agregarLibros(l3);

        p1.mostrarLibros();
        p2.mostrarLibros();
        p3.mostrarLibros();
        p4.mostrarLibros();
        p5.mostrarLibros();
        p6.mostrarLibros();

        l1.mostrarPropietarios();
        l2.mostrarPropietarios();
        l3.mostrarPropietarios();
        l4.mostrarPropietarios();

        System.out.println();

        //Agregacion
        System.out.println("\n-----------------------Agregacion--------------------------\n");
        Empresa empresa = new Empresa("TechSolutions");
        Departamento d1 = new Departamento("Desarrollo de Software");
        Departamento d2 = new Departamento("Ventas y Marketing");
        Departamento d3 = new Departamento("Finanzas y Contabilidad");

        empresa.addDepartamento(d1);
        empresa.addDepartamento(d2);
        empresa.addDepartamento(d3);

        Empleado empleado1 = new Empleado("Juan Perez", "Ingeniero de Software");
        Empleado empleado2 = new Empleado("Mick Jagger", "Desarrollador Frontend");
        Empleado empleado3 = new Empleado("Carlos Ramirez", "QA Tester");

        Empleado empleado4 = new Empleado("Lana del Rey", "Gerente de Ventas");
        Empleado empleado5 = new Empleado("Pedro González", "Representante de Ventas");
        Empleado empleado6 = new Empleado("Laura Rodriguez", "Especialista en Marketing Digital");

        Empleado empleado7 = new Empleado("Luis Miguel", "Director Financiero");
        Empleado empleado8 = new Empleado("María Rodríguez", "Contador Principal");
        Empleado empleado9 = new Empleado("Patricia Sosa", "Analista Financiero");

        d1.addEmpleado(empleado1);
        d1.addEmpleado(empleado2);
        d1.addEmpleado(empleado3);
        d2.addEmpleado(empleado4);
        d2.addEmpleado(empleado5);
        d2.addEmpleado(empleado6);
        d3.addEmpleado(empleado7);
        d3.addEmpleado(empleado8);
        d3.addEmpleado(empleado9);

        empresa.verDepartamentos();
        d1.verEmpleados();
        d2.verEmpleados();
        d3.verEmpleados();

        System.out.println();
        System.out.println();

        // Composicion
        System.out.println("\n---------------------Composicion------------------------\n");
        Casa casa1 = new Casa(6);
        Casa casa2 = new Casa(9);

        casa1.mostrarMaterialPuertas();
        casa2.mostrarMaterialPuertas();



    }

}