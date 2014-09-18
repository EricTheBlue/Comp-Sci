package inputexample;
import java.util.*;
/**
 *
 * @author winsore
 */
public class Inputexample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Please enter an integer to be added: ");
        x = input.nextInt();
        System.out.print("Please enter an integer to be added: ");
        y = input.nextInt();
        System.out.println(x + " + " + y + " = " + (x + y));
    }
    
}
