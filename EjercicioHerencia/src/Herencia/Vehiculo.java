package Herencia;

public abstract class Vehiculo {
    private String color;
    private int cantRuedas;

    public Vehiculo() {
    }

    public Vehiculo(String color, int cantRuedas) {
        this.color = color;
        this.cantRuedas = cantRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public void mostrarAtributos(){
        System.out.println("Color: " + this.color);
        System.out.println("Cantidad ruedas: " + this.cantRuedas);
    }
}
