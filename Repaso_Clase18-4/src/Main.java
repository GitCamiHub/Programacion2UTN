import Supermercado.Producto;
import Supermercado.Supermercado;
import Supermercado.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Producto p1 = new Producto("Arroz", 1200, 10);
        Producto p2 = new Producto("Leche", 1500, 2);
        Producto p3 = new Producto("Fideos", 2500, 8);
        Producto p4 = new Producto("Galletas", 900, 15);
        Producto p5 = new Producto("Gaseosa", 1400, 1);
        Producto p6 = new Producto("Lentejas", 850, 3);

        Supermercado supermercado = new Supermercado();
        supermercado.agregarProductoInventario(p1);
        supermercado.agregarProductoInventario(p2);
        supermercado.agregarProductoInventario(p3);
        supermercado.agregarProductoInventario(p4);
        supermercado.agregarProductoInventario(p5);
        supermercado.agregarProductoInventario(p6);

        Cliente cliente = new Cliente("Florencia", "Bazan");


        System.out.println("\nInventario inicial del supermercado:");
        supermercado.mostrarInventario();

        System.out.println("\nBIENVENIDO AL SUPERMERCADO VIRTUAL. \nSeleccione el numero del producto que desea agregar al carrito.");
        while (true) {
            System.out.println("\n1. " + p1.getNombre() + " $" + p1.getPrecio());
            System.out.println("2. " + p2.getNombre() + " $" + p2.getPrecio());
            System.out.println("3. " + p3.getNombre() + " $" + p3.getPrecio());
            System.out.println("4. " + p4.getNombre() + " $" + p4.getPrecio());
            System.out.println("5. " + p5.getNombre() + " $" + p5.getPrecio());
            System.out.println("6. " + p6.getNombre() + " $" + p6.getPrecio());
            System.out.println("7. Terminar compra.");
            System.out.print("Producto numero: ");
            int respuesta = leer.nextInt();
            if (respuesta == 7) {
                break;
            }
            System.out.print("Cantidad: ");
            int cantidad = leer.nextInt();
            switch (respuesta) {
                case 1:
                    supermercado.realizarCompra(cliente, p1, cantidad);
                    break;
                case 2:
                    supermercado.realizarCompra(cliente, p2, cantidad);
                    break;
                case 3:
                    supermercado.realizarCompra(cliente, p3, cantidad);
                    break;
                case 4:
                    supermercado.realizarCompra(cliente, p4, cantidad);
                    break;
                case 5:
                    supermercado.realizarCompra(cliente, p5, cantidad);
                    break;
                case 6:
                    supermercado.realizarCompra(cliente, p6, cantidad);
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta.");
            }

        }
        System.out.println("\nCarrito de compras:");
        cliente.mostrarCarrito();
        System.out.println("\nEl total de la compra es: $ " + cliente.calcularTotal());
        System.out.println("Hasta la proxima.");

        System.out.println("\nInventario actual supermercado:");
        supermercado.mostrarInventario();
    }
}