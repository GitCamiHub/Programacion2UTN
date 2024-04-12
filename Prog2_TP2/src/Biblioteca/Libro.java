package Biblioteca;

public class Libro implements Prestable{
private String titulo;
private String autor;
private int anioPublicacion;
private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo + "\nAutor: " + autor +
                "\nAño de publicacion: " + anioPublicacion +
                "\nPrestado: " + prestado;
    }

   @Override
    public void prestar() {
       if(!prestado){
           System.out.println("El libro " + titulo + " está disponible.");
           prestado = true;
       }else{
           System.out.println("El libro " + titulo + " está prestado.");
       }
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("Gracias por devolver el libro en tiempo y forma.");
    }
}
