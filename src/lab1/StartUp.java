package lab1;

/**
 *I started this project with the idea that I would try and populate the
 * abstract class with abstract and concrete methods. I soon realized that I 
 * didn't like the concrete inheritance at all. Mainly because of repeating the 
 * properties in the sub-classes. Therefor, this lab has a class declared as
 * abstract but actually acts as if it were an interface class.
 * 
 * @author Mark Van Weelden
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        Course course1 = new IntroToProgrammingCourse("Intro to Programming", "152-107", 2.0);
        
        System.out.println(course1);
        
        Course course2 = new IntroJavaCourse("Intro to Java", "152-134", 4.0, "152-107 Intro to Programming");
        
        System.out.println(course2);
        
        Course course3 = new AdvancedJavaCourse("Advanced Java", "152-135", 4.0, "152-134 Intro to Java");
        
        System.out.println(course3);
        
        
    
    }
    
    
    
    
}
