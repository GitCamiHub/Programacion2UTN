package Clases;

public class Perro extends Animal{
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    private static void caminar(){
        System.out.println("Estoy caminando.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Raza: " + this.raza);
    }
}
