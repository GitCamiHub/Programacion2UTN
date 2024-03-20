package Herencia;

public class Camioneta extends Vehiculo{
    private double carga;

    public Camioneta(){
    }

    public Camioneta(String color, int cantRuedas, double carga) {
        super(color, cantRuedas);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {

        this.carga = carga;
    }

    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Carga: " + this.carga);
    }
}
