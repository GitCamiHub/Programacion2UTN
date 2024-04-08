package Punto8;

public class Trabajador extends Empleado{
    private String area;

    public Trabajador(String nombre, int edad, double salario, String area) {
        super(nombre, edad, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void producirEnArea(){
        System.out.println("El/La empleado/a " + getNombre() + " produce en el área de " + area);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nArea:" + area;
    }
}
