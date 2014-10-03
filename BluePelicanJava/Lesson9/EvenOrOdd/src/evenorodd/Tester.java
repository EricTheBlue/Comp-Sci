package evenorodd;
import java.io.*;
import java.util.*;

// Author: Eric Winsor
// Date Created: October 2, 2014
public class Tester {
    
    public static void main(String args[]) {
        
        // Request an integer from the user
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = kbReader.nextInt();
        
        // Output whether integer is even or odd
        if (num % 2 == 0) System.out.println("The integer " + num + " is even.");
        else System.out.println("The integer " + num + " is odd.");
        
    }
    
}