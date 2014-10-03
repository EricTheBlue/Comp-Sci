package calculator;
import java.io.*;
import java.util.*;

public class Calculator {
    
    public static void main(String args[]) {
        
        System.out.println("Make your arithmetic selection from the choices below:\n");
        
        System.out.println("   1. Addition");
        System.out.println("   2. Subtraction");
        System.out.println("   3. Multiplication");
        System.out.println("   4. Division\n");
        
        System.out.print("      Your choice? ");
        
        Scanner kbReader = new Scanner(System.in);
        String choice = kbReader.next();
        
        System.out.print("\nEnter first operand. ");
        double op1 = kbReader.nextDouble();
        System.out.print("\nEnter second operand. ");
        double op2 = kbReader.nextDouble();
        
        System.out.println("");
        
        switch (choice) {
            case "Add": //addition
                System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
                break;
            case "Subtract": //subtraction
                System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
            case "Multiply": //multiplication
                System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
            case "Divide": //division
                System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
            default:
                System.out.println("Hey dummy, enter only a 1, 2, 3, or 4!");
        }
        
    }
    
}