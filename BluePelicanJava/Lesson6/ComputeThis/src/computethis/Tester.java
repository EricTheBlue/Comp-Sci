package computethis;

// Author: Eric Winsor
// Date created: October 2, 2014
public class Tester {
    
    public static void main(String args[]) {
        
        // Initialize variables
        double d1 = 3 * Math.PI * Math.sin(Math.toRadians(187)) + Math.abs(Math.cos(Math.toRadians(122)));
        double d2 = Math.pow(14.72, 3.801) + Math.log(72);
        
        // Print the results of the computations
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        
    }
    
}