import java.util.ArrayList;

public class Plataforma {
    //Atributos
    private ArrayList<Pelicula> peliculas;

    //Constructor
    public Plataforma(){
        this.peliculas=new ArrayList<>();
    }

    //Metodo buscar
    public String listarPelicula(CondicionBusqueda condicion){
        for (Pelicula p: peliculas) {
           if(condicion.cumple(p)) {
               return p.getTitulo();
           }
        }
        return null;
    }

    //Agregar pelicula
    public void addPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

}
