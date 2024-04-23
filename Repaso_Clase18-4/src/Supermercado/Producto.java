package Supermercado;

public class Producto {
    private String nombre;
    private double precio;
    private int cantStock;

    public Producto(String nombre, double precio, int cantStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantStock = cantStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    @Override
    public String toString() {
        return nombre + " $" + precio + " Cantidad: " + cantStock;
    }
}
