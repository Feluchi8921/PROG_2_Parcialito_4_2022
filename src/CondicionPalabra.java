public class CondicionPalabra extends CondicionBusqueda{

    //Atributo
    private static String palabra= "palabra";

    //Constructor
    public CondicionPalabra(String palabra){
        super();
        this.palabra=palabra;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.getTitulo().contains(palabra);
    }
}
