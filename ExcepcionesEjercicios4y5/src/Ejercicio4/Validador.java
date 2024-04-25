package Ejercicio4;

public class Validador {
    public boolean edadValida(int edad) throws EdadNoValidaException{
        if (edad <= 3 || edad > 18) {
            throw new EdadNoValidaException("Ingrese una edad entre 3 y 18");
        }
        return true;
    }

    public boolean notaValida(double nota) throws NotaNoValidaException{
        if (nota < 0 || nota > 10) {
            throw new NotaNoValidaException("Ingrese una nota entre 0 y 10.");
        }
        return true;
    }

    public boolean nombreValido(String nombre) throws NombreNoValidoException{
        if(nombre.isEmpty()){
            throw new NombreNoValidoException("Debe ingresar un nombre.");
        }
        return true;
    }
}
