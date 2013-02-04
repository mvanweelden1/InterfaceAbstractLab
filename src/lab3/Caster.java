package lab3;

/**
 *This interface just adds methods specific to the caster type of character.
 * 
 * @author Mark Van Weelden
 */
public interface Caster extends Character{
    
    public abstract void setAttribute(String attribute);
    
    public abstract String getAttribute();
    
}
