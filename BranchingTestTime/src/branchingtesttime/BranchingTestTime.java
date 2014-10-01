package branchingtesttime;
import java.util.*;
/**
 * Name: Eric Winsor
 * Date: 9/29/2014
 * Project Title: Branching: Test Time
 */
public class BranchingTestTime {

    public static void main(String[] args) {
        
        // Prompt user for number of correct answers and total questions attempted
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of correct answers and the number of problems attempted: ");
        int correct = input.nextInt();
        int total = input.nextInt();
        
        // Print number correct, total attempted, and percentage
        System.out.print("You have " + correct + " correct out of " + total + " for a percentage of " + ((double) Math.round((double) correct / total * 1000) / 10) + "\nYou have earned ");
        
        // Calculate and print number of points
        if (total < 50) System.out.println("0 points");
        if (total >= 50 && total < 75) System.out.println(correct * 1.6 + " points");
        if (total >= 75) System.out.println(correct * 1.2 + " points");
        
    }

}
