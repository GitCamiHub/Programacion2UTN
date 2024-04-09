public class Picaro extends PersonajeBase {
    public Picaro(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public int atacar(){
        System.out.println("----------------------");
        System.out.println("PICARO ATACANDO");
        System.out.println("----------------------");
        if (getNivel() == 1){
            return 5;
        }else if( getNivel()== 2){
            return 10;
        }else{
            return 15;
        }

    }
}
