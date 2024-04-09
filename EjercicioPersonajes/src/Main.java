
public class Main {
    public static void main(String[] args) {
        // Mago nivel 2 hace daño de 12
        Mago mago = new Mago("Merlin",2);
        // Guerrero nivel 3 hace daño de 25
        Guerrero guerrero = new Guerrero("Gladiador", 3);
        // Picaro nivel 3 hace daño de 15
        Picaro picaro = new Picaro("Loki",3);

        // Mostramos estado inicial de los jugadores
        System.out.println(mago);
        System.out.println(guerrero);
        System.out.println(picaro);


        // Mago ataca a guerrero
        guerrero.defender(mago.atacar());
        System.out.println(mago);
        System.out.println(guerrero);
        // Guerrero ataca a mago
        mago.defender(guerrero.atacar());
        System.out.println(mago);
        System.out.println(guerrero);
        // Picaro y mago atacan a guerrero
        guerrero.defender(picaro.atacar());
        guerrero.defender(mago.atacar());
        System.out.println(mago);
        System.out.println(guerrero);
        System.out.println(picaro);
        // Guerrero ataca a mago y lo mata
        mago.defender(guerrero.atacar());
        System.out.println(mago);
        System.out.println(guerrero);
    }
}