public abstract class PersonajeBase implements Personaje{
    private String nombre;
    private int nivel;
    private int puntosDeVida;

    public PersonajeBase(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = 50;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public void defender(int danio) {

        puntosDeVida -= danio;

        if (puntosDeVida <= 0){
            System.out.println("GAME OVER " + getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNivel: " + nivel + "\nPuntos de vida: " + puntosDeVida;
    }
}
