package namethatcelebrity;

// Author: Eric Winsor
// Date created: October 2, 2014
public class Tester {
    
    public static void main(String args[]) {
        
        // Initialize names
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";
        
        // Output names without first 2 and last 3 letters
        System.out.println(s1 + ">>>" + s1.substring(2, s1.length() - 3));
        System.out.println(s2 + ">>>" + s2.substring(2, s2.length() - 3));
        System.out.println(s3 + ">>>" + s3.substring(2, s3.length() - 3));
        
    }
    
}