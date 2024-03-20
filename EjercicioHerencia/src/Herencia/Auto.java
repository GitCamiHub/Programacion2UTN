package Herencia;

public class Auto extends Vehiculo{
    private double velocidad;
    private double cilindrada;

    public Auto() {
    }

    public Auto(String color, int cantRuedas, double velocidad, double cilindrada) {
        super(color, cantRuedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Velocidad: " + this.velocidad);
        System.out.println("Cilindrada: " + this.cilindrada);
    }

}
