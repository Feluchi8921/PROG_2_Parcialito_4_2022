public class CondicionActor extends CondicionBusqueda{
    //Atributo
    private Actor actor;
    public CondicionActor(Actor actor){
        super();
        this.actor=actor;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.tieneActor(actor);
    }
}