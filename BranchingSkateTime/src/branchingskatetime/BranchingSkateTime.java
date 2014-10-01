package branchingskatetime;
import java.util.*;
import java.text.*;
/**
 * Name: Eric Winsor
 * Date: 9/29/2014
 * Project Title: Branching: Skate Time
 */
public class BranchingSkateTime {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes played: ");
        int minutes = input.nextInt();
        double cost = 3.10 + minutes / 20 * 2.55;
        if (minutes % 20 != 0) cost += 2.55;
        if (cost > 18.75) cost = 18.75;
        DecimalFormat df = new DecimalFormat("$##.00");
        System.out.println("You played for " + minutes + " minutes, which will cost you " + df.format(cost));
        
    }

}
