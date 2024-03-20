package Herencia;

public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String color, int cantRuedas, String tipo) {
        super(color, cantRuedas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Tipo: " + this.tipo);
    }
}
