package Punto9;

public class Circulo extends FiguraGeometrica{
    private double radio;
    private final double PI = Math.PI;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
