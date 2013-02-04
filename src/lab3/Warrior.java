package lab3;

import javax.swing.JOptionPane;

/**
 *This is the most specific subclass and therefor this is where all the properties
 * and concrete methods are located.
 * 
 * All methods here are declared final as to adhere to the open/closed principle
 * @author Mark Van Weelden
 */
public class Warrior implements Character{
    
    private String name;
    private int health;
    private int mana;
    private final int MAX_HEALTH = 200;
    private final int MAX_MANA = 20;
    

    public Warrior(String name, int health, int mana) {
        this.setName(name);
        this.setHealth(health);
        this.setMana(mana);
        
    }
    
    
    public final void setName(String name) {
        if(name == null || name.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: name cannot be null of empty string");
            System.exit(0);
        }
        this.name = name;
    }

    public final void setHealth(int health) {
        if(health < 1 || health > MAX_HEALTH) {
            JOptionPane.showMessageDialog(null,
                    "Error: health must be in the range 1 to 200");
            System.exit(0);
        }
        this.health = health;
    }

    public final void setMana(int mana) {
        if(mana < 1 || mana > MAX_MANA) {
            JOptionPane.showMessageDialog(null,
                    "Error: mana must be in the range 1 to 200");
            System.exit(0);
        }
        this.mana = mana;
    }

    public final String getName() {
        return name;
    }

    public final int getHealth() {
        return health;
    }

    public final int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "Warrior{" + "name=" + name + ", health=" + health + ", mana=" 
                + mana + '}';
    }
    
    
}
