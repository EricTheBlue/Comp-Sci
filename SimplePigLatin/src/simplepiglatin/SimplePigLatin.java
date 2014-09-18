package simplepiglatin;
import java.util.*;
/**
 *
 * @author winsore
 */
public class SimplePigLatin {

    public static void main(String[] args) {
        // Have user input "[First Name] [Last Name]"
        Scanner input = new Scanner(System.in);
        String first, last;
        System.out.print("Please enter your first and last name: ");
        first = input.next();
        last = input.next();
        
        // Get the first letter of each name and convert to lower case
        String firstStart = first.substring(0,1).toLowerCase();
        String lastStart = last.substring(0,1).toLowerCase();
        
        // Test whether first letter is a vowel
        if (!(firstStart.equals("a") || firstStart.equals("e") || firstStart.equals("i") || firstStart.equals("o") || firstStart.equals("u"))) {
            // Work around substring error by checking that name is greater than length 1
            if (first.length() > 1) {
                // Move first letter to end of name and add "ay"
                first = first.substring(1) + firstStart + "ay";
                // Fix capitalization
                first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
            } else {
                // (Unlikely) single letter name case; Just adds "ay"
                first = first.toUpperCase() + "ay";
            }
        } else {
            // First letter is vowel, so it stays at front
            first += "ay";
            // Fix capitalization
            first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        }
        
        // Worth noting that this segment is identical to previous section but operates on last name
        // Test whether first letter is a vowel
        if (!(lastStart.equals("a") || lastStart.equals("e") || lastStart.equals("i") || lastStart.equals("o") || lastStart.equals("u"))) {
            // Work around substring error by checking that name is greater than length 1
            if (last.length() > 1) {
                // Move first letter to end of name and add "ay"
                last = last.substring(1) + lastStart + "ay";
                // Fix capitalization
                last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
            } else {
                // (Unlikely) single letter name case; Just adds "ay"
                last = last.toUpperCase() + "ay";
            }
        } else {
            // First letter is vowel, so it stays at front
            last += "ay";
            // Fix capitalization
            last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        }
        
        // Print finalized first and last name
        System.out.println(first + " " + last);
    }
    
}
