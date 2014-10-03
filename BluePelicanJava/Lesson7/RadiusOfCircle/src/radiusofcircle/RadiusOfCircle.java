package radiusofcircle;
import java.io.*;
import java.util.*;

// Author: Eric Winsor
// Date Created: October 2, 2014
public class RadiusOfCircle {
    
    public static void main(String args[]) {
        
        // Request user input of area
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is the area? ");
        double area = kbReader.nextDouble();
        
        // Print radius
        System.out.println("Radius of your circle is " + Math.sqrt(area / Math.PI) + ".");
        
    }
    
}