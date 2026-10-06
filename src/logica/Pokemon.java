package logica;

/**
 *
 * @author m.manotas
 */
public abstract class Pokemon {
    protected int numPokedek;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAracnizar();
    protected abstract void atacarMordisco();
}
