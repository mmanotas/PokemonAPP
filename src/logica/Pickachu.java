package logica;

/**
 *
 * @author m.manotas
 */
public class Pickachu extends Pokemon implements IElectrico{

    public Pickachu() {
    }  
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque de Placaje Pikachu");
    }

    @Override
    protected void atacarAracnizar() {
        System.out.println("Arañazos de Pikachu");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque de mordisco de Pikachu");
    }

    @Override
    public void atacarImpactoTrueno() {
        System.out.println("Ataque de rayo y sonido de trueno Picachu");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Puño de trueno pocaca");
    }
    
}
