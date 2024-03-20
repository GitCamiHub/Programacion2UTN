package Clases;

public class Pajaro extends Animal{
    private String especie;

    public Pajaro() {
    }

    public Pajaro(String nombre, int edad, String genero, String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public static void volar(){
        System.out.println("Estoy volando.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pri pri pri");
    }
    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Especie: " + this.especie);
    }
}
