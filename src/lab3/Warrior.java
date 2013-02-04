package lab3;

/**
 *
 * @author Mark Van Weelden
 */
public class Warrior implements Character{
    
    private String name;
    private int health;
    private int mana;

    public Warrior(String name, int health, int mana) {
        this.setName(name);
        this.setHealth(health);
        this.setMana(mana);
        
    }
    
    

    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setHealth(int health) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setMana(int mana) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getMana() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
