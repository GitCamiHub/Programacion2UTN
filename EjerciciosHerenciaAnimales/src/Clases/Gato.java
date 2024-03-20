package Clases;

public class Gato extends Animal{
    private String tipoPelo;

    public Gato() {
    }

    public Gato(String nombre, int edad, String genero, String tipoPelo) {
        super(nombre, edad, genero);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
    public static void trepar(){
        System.out.println("Estoy trepando.");
    }
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }
    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Tipo de pelo: " + this.tipoPelo);
    }
}
