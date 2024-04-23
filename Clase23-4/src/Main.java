import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int numero1 = 0;
        int numero2 = 0;
        String operador = "";
        double resultado = 0;
        int opcion = 0;

        while (opcion!=2) {
                System.out.println("\nCALCULADORA");
                System.out.println("1. Ingresar numeros");
                System.out.println("2. Salir");
                System.out.print("Elegir opcion: ");
                try {
                    opcion = leer.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Error.");
                    leer.nextLine();
                }

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("\nIngresa el primer numero entero: ");
                        numero1 = leer.nextInt();

                        System.out.print("\nIngresa el segundo numero entero: ");
                        numero2 = leer.nextInt();

                        System.out.print("\nIngresa la operacion (+, -, / , *): ");
                        operador = leer.next();

                        if (!operador.equals("+") && !operador.equals("-") && !operador.equals("/") && !operador.equals("*")) {
                            throw new RuntimeException("\nEl operador " + operador + " no es valido. Ingresa +, -, /, *.");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("\nTenes que ingresar un numero entero.");
                        leer.nextLine();
                        continue;

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        leer.nextLine();
                    }

                    switch (operador) {
                        case "+":
                            resultado = numero1 + numero2;
                            break;
                        case "-":
                            resultado = numero1 - numero2;
                            break;
                        case "/":
                            try {
                                resultado = numero1 / numero2;
                            } catch (ArithmeticException e) {
                                System.out.println("\nNo se puede dividir por cero. Ingresa otro numero.");
                                leer.nextLine();
                                resultado = 0;
                            }
                            break;
                        case "*":
                            resultado = numero1 * numero2;
                            break;
                    }

                    System.out.println("\n" + numero1 + " " + operador + " " + numero2 + " = " + resultado);
                    break;
                case 2:
                    System.out.println("\nSaliendo de la calculadora.");
                    break;
                default:
                    System.out.println("\nIngresa numeros enteros, 1 o 2.");
            }
        }
    }
}

