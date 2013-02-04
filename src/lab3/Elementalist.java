/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Owner
 */
public class Elementalist implements Caster{
    
    private String name;
    private int health;
    private int mana;
    private String attribute;

    public Elementalist(String name, int health, int mana, String attribute) {
        this.setName(name);
        this.setHealth(health);
        this.setMana(mana);
        this.setAttribute(attribute);
        
    }
    
    
    public final void setAttribute(String attribute) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final String getAttribute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final void setHealth(int health) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final void setMana(int mana) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final int getHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final int getMana() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
