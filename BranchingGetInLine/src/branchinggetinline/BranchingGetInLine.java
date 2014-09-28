package branchinggetinline;
import java.util.*;

/**
 * Name: Eric Winsor
 * Date: 9/26/2014
 * Project Title: Branching: Get In Line
 */
public class BranchingGetInLine {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input x1, y1, x2, y2, x3, y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        System.out.print("(" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ") (" + x3 + "," + y3 + ") are ");
        if (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) == 0) {
            System.out.println("collinear");
        }
        
        if (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) != 0) {
            System.out.println("not collinear");
        }
    }
    
}
