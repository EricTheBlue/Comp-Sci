package fullname;
import java.io.*;
import java.util.*;

// Author: Eric Winsor
// Date Created: October 2, 2014

public class FullName {
    
    public static void main(String args[]) {
        
        // Request first and last name from user
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = kbReader.next();
        System.out.print("What is your last name? ");
        String lastName = kbReader.next();
        
        // Print out full name
        System.out.println("Your full name is " + firstName + " " + lastName + ".");
        
    }
    
}