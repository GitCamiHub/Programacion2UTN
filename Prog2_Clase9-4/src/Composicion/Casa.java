package Composicion;

import java.util.ArrayList;

public class Casa {
    private Puerta [] puertas;

    public Casa(int cantidadPuertas) {
        this.puertas = new Puerta [cantidadPuertas];
        String [] materiales = {"Madera","MDF","Metal","Vidrio"};
        for (int i = 0; i < puertas.length; i++) {
            puertas[i] = new Puerta(materiales[(int) (Math.random()*4)]);
        }
    }

    public Puerta[] getPuertas() {
        return puertas;
    }


    public void mostrarMaterialPuertas(){
        System.out.println("\nCasa:");
        for (int i = 0; i < puertas.length; i++) {
            System.out.println(puertas[i]);
        }
    }
}
