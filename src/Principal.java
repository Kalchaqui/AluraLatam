import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //creamos una nueva instancia, crea en memoria un espacio para ese objeto
                                              //Para almacenar datos
        miPelicula.setNombre("Alien");
        miPelicula.setFechaDeLanzamiento(1979);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

miPelicula.muestraFichaTecnica();
miPelicula.evalua(8.5);
miPelicula.evalua(10);
miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());



       // com.aluracursos.screenmatch.modelos.Pelicula miPelicula2 = new com.aluracursos.screenmatch.modelos.Pelicula();
        //miPelicula2.nombre = "Alien2";
        //miPelicula2.fechaDeLanzamiento = 2022;
        //miPelicula2.duracionEnMinutos = 110;

        //System.out.println("Mi Película es: " + miPelicula2.nombre);
        //System.out.println ("Su fecha de lanzamiento fue: " + miPelicula2.fechaDeLanzamiento);

        //En Java, los objetos se almacenan en una región de memoria llamada "heap".
        // Cada objeto tiene una dirección única en esta región de memoria.
        // Cuando imprimimos un objeto en pantalla, como este:
        //-----------------------------------
        //MiClase objeto = new MiClase();
        //System.out.println(objeto);
    }
}
