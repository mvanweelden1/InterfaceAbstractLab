/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class Elementalist implements Caster{
    
    private String name;
    private int health;
    private int mana;
    private String attribute;
    private final int MAX_HEALTH = 100;
    private final int MAX_MANA = 100;

    public Elementalist(String name, int health, int mana, String attribute) {
        this.setName(name);
        this.setHealth(health);
        this.setMana(mana);
        this.setAttribute(attribute);
        
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

    public void setAttribute(String attribute) {
        if(attribute == null || attribute.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: attribute cannot be null of empty string");
            System.exit(0);
        }
        
        
        this.attribute = attribute;
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

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String toString() {
        return "Elementalist{" + "name=" + name + ", health=" + health 
                + ", mana=" + mana + ", attribute=" + attribute 
                + '}';
    }
    
    
}
