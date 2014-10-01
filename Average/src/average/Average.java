package average;
import java.util.*;
/**
 * Name: Eric Winsor
 * Date: 10/1/2014
 * Project Title: Average
 */
public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number 1: ");
        double a = input.nextDouble();
        double average = a;
        double min = a;
        double max = a;
        for (int i = 2; i <= 10; i++) {
            System.out.print("Input number " + i + ": ");
            a = input.nextDouble();
            average += a;
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        average /= 10;
        System.out.println("The average is " + average + ". The minimum value is " + min + ". The maximum value is " + max + ".");
    }

}
