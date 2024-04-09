import java.sql.SQLOutput;

public class Mago extends PersonajeBase{
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public int atacar() {
        System.out.println("----------------------");
        System.out.println("MAGO ATACANDO");
        System.out.println("----------------------");
        if (getNivel() == 1){
            return 10;
        }else if( getNivel()== 2){
            return 12;
        }else{
            return 20;
        }
    }
}
