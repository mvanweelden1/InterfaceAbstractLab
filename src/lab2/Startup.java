package lab2;

/**
 *I think this is a good design. It prevents the subclasses from inheriting 
 * bad code. The only bad I see is the extra work implementing the methods
 * in all the subclasses. That being said it is obvious that the extra work at
 * that point is worth it in the long run.
 * 
 * The LSP should be able to be used anytime this interface design is used.
 * 
 * 
 * @author Mark Van Weelden
 */
public class Startup {
    
    public static void main(String[] args) {
        
        Course course1 = new IntroToProgrammingCourse("Intro to Programming", "152-107", 2.0);
        
        System.out.println(course1);
        
        Course course2 = new IntroJavaCourse("Intro to Java", "152-134", 4.0, "152-107 Intro to Programming");
        
        System.out.println(course2);
        
        Course course3 = new AdvancedJavaCourse("Advanced Java", "152-135", 4.0, "152-134 Intro to Java");
        
        System.out.println(course3);
        
        
    
    }
    
}
