import java.util.ArrayList;

public class Pelicula {
    //Atributos
    private String titulo;
    private String sinopsis;
    private String genero;
    private String director;
    private int anio;
    private int duracion;
    private int minEdad;
    private ArrayList<Actor> actores;

    //Constructor
    public Pelicula(String titulo, String sinopsis, String genero, String director, int anio, int duracion, int minEdad){
        this.titulo=titulo;
        this.sinopsis=sinopsis;
        this.genero=genero;
        this.director=director;
        this.anio=anio;
        this.duracion=duracion;
        this.minEdad=minEdad;
        this.actores=new ArrayList<>();
    }

    //Getters and Setters
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getMinEdad() {
        return minEdad;
    }

    public void setMinEdad(int minEdad) {
        this.minEdad = minEdad;
    }

    public boolean tieneActor(Actor actor){
        for (Actor a: actores) {
            if(a.equals(actor)){
                return true;
            }
        }
        return false;
    }
}
