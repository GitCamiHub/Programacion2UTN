package Punto8;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void organizarDepartamento(){
        System.out.println("El/La gerente/a " + getNombre() + " está organizando el departamento de " + departamento);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDepartamento:" + departamento;
    }
}
