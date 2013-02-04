package lab3;

/**
 *This class needs to be an Interface because its only job is to provide a 
 * template of common methods for all characters.
 * 
 * All methods need to declared abstract and there are no properties listed here.
 * @author Mark Van Weelden
 */
public interface Character {
    
    public abstract void setName(String name);
    
    public abstract void setHealth(int health);
    
    public abstract void setMana(int mana);
    
    public abstract String getName();
    
    public abstract int getHealth();
    
    public abstract int getMana();
    
    
    
}
