package TiendaAnimales;

public abstract class Animal {
    private String nombre;
    private int edad;
    private double precio;
    private String tipoAnimal;

    public Animal(String nombre, int edad, double precio, String tipoAnimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.precio = precio;
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void alimentar(String nombre){
        if (nombre.equals(getNombre())) {
            System.out.println("Alimentando a " + getNombre());
        } else{
            System.out.println("No existe un " + getClass().getSimpleName() + " llamado " + nombre);
        }

    }

    @Override
    public String toString() {
        return "\n" + tipoAnimal + ": Hola soy " + nombre + ", tengo " + edad + " años. Me podes comprar por $" + precio;
    }
}
