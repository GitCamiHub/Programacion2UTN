package Ejercicio5;

public class Validador {
    public boolean validarDescripcion (String descripcion) throws DescripcionException{
        if(descripcion.isEmpty()){
            throw new DescripcionException("Debe ingresar una descripcion de la tarea.");
        }
        return true;
    }

    public boolean validarPrioridad(int prioridad) throws PrioridadException{
        if(prioridad<1 || prioridad>10){
            throw new PrioridadException("El numero de prioridad debe estar entre 1 y 10.");
        }
        return true;
    }
}
