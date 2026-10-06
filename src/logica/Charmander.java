package logica;

/**
 *
 * @author m.manotas
 */
public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAracnizar() {
        System.out.println("Hola soy Charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque puño fuego");
    }

    @Override
    public void atacarLanzaLllama() {
        System.out.println("Hola soy Charmander y este es mi ataque lanzallamas");
    }

    @Override
    public void atacarascuas() {
         System.out.println("Hola soy Charmander y este es mi ataque ascuas");
    }
    
}
