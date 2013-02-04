package lab3;

/**
 *I am interested in getting feedback on my use of the Caster interface
 * extending the Character interface. I was trying to go three deep with the 
 * inheritance and that is what I came up with. My gut feeling is that the better
 * design would have been separate interfaces.
 * 
 * @author Mark Van Weelden
 */
public class Startup {
    
    public static void main(String[] args) {
        
        Character war1 = new Warrior("Bob", 175, 15);
        
        System.out.println(war1);
        
        Character ele1 = new Elementalist("Sally", 100, 100, "Fire");
        
        System.out.println(ele1);
    }
    
}
