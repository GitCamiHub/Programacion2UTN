public class Guerrero extends PersonajeBase{
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }



    @Override
    public int atacar() {
        System.out.println("----------------------");
        System.out.println("GUERRERO ATACANDO");
        System.out.println("----------------------");
        if (getNivel() == 1){
            return 10;
        }else if( getNivel()== 2){
            return 15;
        }else{
            return 25;
        }
    }
}
