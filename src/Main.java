public class Main {
    public static void main(String[] args) {
       Plataforma plataforma = new Plataforma();
       Pelicula pelicula1 = new Pelicula("Luna a marte", "sarasa", "accion", "Roberto", 2013, 60, 18);
       plataforma.addPelicula(pelicula1);
       CondicionPalabra condicionNombre = new CondicionPalabra("Luna");
       System.out.println(plataforma.listarPelicula(condicionNombre));

    }
}