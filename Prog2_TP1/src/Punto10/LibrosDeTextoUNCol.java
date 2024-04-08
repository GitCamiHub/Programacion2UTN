package Punto10;

public class LibrosDeTextoUNCol extends LibrosDeTexto{
    private String facultad;

    public LibrosDeTextoUNCol(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFacultad: " + facultad;
    }
}
