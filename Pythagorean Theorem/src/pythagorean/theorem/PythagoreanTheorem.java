package pythagorean.theorem;
import java.util.*;
/**
 *
 * @author Eric
 */
public class PythagoreanTheorem {

    public static void main(String[] args) {
        // Get user input for side lengths a and b
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.print("Please enter side length a: ");
        a = input.nextDouble();
        System.out.print("Please enter side length b: ");
        b = input.nextDouble();
        
        // Print c solved from a ^ 2 + b ^ 2 = c ^ 2
        System.out.println("c = " + Math.sqrt(a * a + b * b));
    }
    
}
