package proj2_winsor;
import java.util.*;
/**
 * Name: Eric Winsor
 * Date: 9/24/2014
 * Project Title: Solving Quadratics
 */
public class Proj2_Winsor {

    public static void main(String[] args) {
        
        // Ask for user input for a, b, and c
        Scanner input = new Scanner(System.in);
        System.out.print("Input a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // Compute discriminant
        double discriminant = b * b - 4 * a * c;
        
        // Print no roots if discriminant is negative
        if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        }
        
        // Print single root using formula without discriminant if discriminant is zero
        if (discriminant == 0) {
            System.out.println("The root is " + (-1 * b / 2 * a));
        }
        
        // Print plus and minus roots if discriminant is positive
        if (discriminant > 0) {
            System.out.println("The roots are " + ((-1 * b - Math.sqrt(discriminant)) / 2 * a) + " and " + ((-1 * b + Math.sqrt(discriminant)) / 2 * a));
        }
    }
    
}
