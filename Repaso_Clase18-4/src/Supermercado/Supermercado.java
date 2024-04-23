package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<Producto> inventario;

    public Supermercado() {
        this.inventario = new ArrayList<>();
    }

    public List<Producto> getInventario() {
        return inventario;
    }

    public void agregarProductoInventario(Producto producto) {
        inventario.add(producto);
    }

    public void buscarProducto(String nombreProducto) {
        int contador = 0;
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombreProducto)) {
                System.out.println(producto);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontro ningun producto con ese nombre.");
        }
    }

    public void realizarCompra(Cliente cliente, Producto producto, int cantidad) {
        if (inventario.contains(producto)) {
            int stockProducto = producto.getCantStock() - cantidad;
            if (stockProducto < 0) {
                System.out.println("Quedan solo " + producto.getCantStock() + " unidades.");
            } else {
                producto.setCantStock(producto.getCantStock() - cantidad);
                for (int i = 0; i < cantidad ; i++) {
                    cliente.agregarProductoCarrito(producto);
                }
                System.out.println("Producto agregado al carrito.");
                if (producto.getCantStock() == 0) {
                    inventario.remove(producto);
                }
            }
        } else {
            System.out.println("No hay " + producto.getNombre() + " en stock.");
        }
    }


    public void mostrarInventario() {
        for (Producto producto:inventario) {
            System.out.println(producto);
        }
    }
}
