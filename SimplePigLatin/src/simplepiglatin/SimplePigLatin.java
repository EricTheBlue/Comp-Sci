package simplepiglatin;
import java.util.*;
/**
 *
 * @author winsore
 */
public class SimplePigLatin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first, last;
        System.out.print("Please enter your first and last name: ");
        first = input.next();
        last = input.next();
        String firstStart = first.substring(0,1).toLowerCase();
        String lastStart = last.substring(0,1).toLowerCase();
        if (!(firstStart.equals("a") || firstStart.equals("e") || firstStart.equals("i") || firstStart.equals("o") || firstStart.equals("u"))) {
            int len1 = first.length();
            if (len1 > 2) {
                
            }
        } else {
            first += "ay";
        }
        if (!(lastStart.equals("a") || lastStart.equals("e") || lastStart.equals("i") || lastStart.equals("o") || lastStart.equals("u"))) {
            last = last.substring(1,last.length()) + lastStart + "ay";
        } else {
            last += "ay";
        }
        System.out.println(first + " " + last);
    }
    
}
