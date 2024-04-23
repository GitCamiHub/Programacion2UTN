package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private List<Producto> carrito;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrito = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void agregarProductoCarrito(Producto producto){
        carrito.add(producto);
    }

    public double calcularTotal(){
        double total=0;
        for (Producto producto:carrito) {
            total += producto.getPrecio();
        }
        return total;
    }
    public void mostrarCarrito(){
        if (!carrito.isEmpty()) {
            for (Producto producto : carrito) {
                System.out.println(producto.getNombre() + " $" + producto.getPrecio());
            }
        } else {
            System.out.println("El carrito está vacio");
        }
    }
}
