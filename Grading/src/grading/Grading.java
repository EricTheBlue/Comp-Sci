package grading;
import java.util.*;
/**
 * Name: Eric Winsor
 * Date: 9/24/2014
 * Project Title: Grading
 */
public class Grading {

    public static void main(String[] args) {
        
        // Initialize input variable
        Scanner input = new Scanner(System.in);
        
        // Request test grade
        System.out.print("Input Test Grade: ");
        int testGrade = input.nextInt();
        
        // Request homework grade
        System.out.print("Input Homework Grade: ");
        int homeworkGrade = input.nextInt();
        
        // Request final exam grade
        System.out.print("Input Final Exam Grade: ");
        int examGrade = input.nextInt();
        
        // Compute final grade with weighted average
        int finalGrade = (int) Math.round(0.8 * (0.5 * testGrade + 0.5 * homeworkGrade) + 0.2 * examGrade);
        
        // Print final percentage
        System.out.print("Your trimester grade is " + finalGrade + "%, which is a");
        
        // Easter egg
        if (finalGrade > 9000) {
            System.out.println(" C++.");
        }
        
        // Greater than 100 is automatic A+
        if (finalGrade <= 9000) {
            if (finalGrade >= 100) {
                System.out.print(" A+");
            }
        }
        
        // Between 90 and 100 is A
        if (finalGrade < 100) {
            if (finalGrade >= 90) {
                System.out.print(" A");
            }
        }
        
        // Between 80 and 90 is B
        if (finalGrade < 90) {
            if (finalGrade >= 80) {
                System.out.print(" B");
            }
        }
        
        // Between 70 and 80 is C
        if (finalGrade < 80) {
            if (finalGrade >= 70) {
                System.out.print(" C");
            }
        }
        
        // Between 60 and 70 is D
        if (finalGrade < 70) {
            if (finalGrade >= 60) {
                System.out.print(" D");
            }
        }
        
        // Less than 60 is E
        if (finalGrade < 60) {
            System.out.println("n E.");
        }
        
        // Check if grade is better than E but not automatic A+
        if (finalGrade >= 60) {
            if (finalGrade < 100) {
                
                // Compute the ones digit of the grade
                int secondDigit = finalGrade % 10;
                
                // Give - for ones digit at most 2
                if (secondDigit <= 2) {
                    System.out.println("-.");
                }
                
                // Check if grade is not -
                if (secondDigit > 2) {
                    
                    // Give + for ones digit at least 8
                    if (secondDigit >= 8) {
                        System.out.println("+.");
                    }
                    
                    // Add . for remaining grades
                    if (secondDigit < 8) {
                        System.out.println(".");
                    }
                }
            }
        }
        
    }
    
}
