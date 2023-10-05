public class CondicionGenero extends CondicionBusqueda{
    //Atributo
    public static String genero = "terror";
    public CondicionGenero(){
        super();
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.getGenero().contains((genero));
    }
}
