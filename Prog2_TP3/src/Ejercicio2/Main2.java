package Ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Marcelo");
        Empleado e2 = new Empleado("Juana");

        e1.asignarSupervisor(e2);
        System.out.println(e1.obtenerNombreSupervisor());
        System.out.println(e2.obtenerNombreSupervisor());
    }
}
