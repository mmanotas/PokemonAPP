package logica;

/**
 *
 * @author m.manotas
 */
public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }
        

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAracnizar() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidroBomba() {
         System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
 System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
         System.out.println("Hola soy Squirtle y este es mi ataque pistola agua");
    }
    
}
