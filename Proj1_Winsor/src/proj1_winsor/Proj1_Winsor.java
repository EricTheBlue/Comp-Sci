/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proj1_winsor;

/**
 * Name: Eric Winsor
 * Date: 9/10/2014
 * Project Title: Name Offset
 */
public class Proj1_Winsor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Take names and convert to lower case
        String firstName = "Eric".toLowerCase();
        String lastName = "Winsor".toLowerCase();
        
        // Get length of names
        int firstLen = firstName.length();
        int lastLen = lastName.length();
        
        // Take last letter of names, capitalize it, and move it to the front
        String firstOffset = firstName.substring(firstLen - 1, firstLen).toUpperCase() + firstName.substring(0, firstLen - 1);
        String lastOffset = lastName.substring(lastLen - 1, lastLen).toUpperCase() + lastName.substring(0, lastLen - 1);
        
        // Print first and last name offset with a space in between
        System.out.println(firstOffset + " " + lastOffset);
    }
    
}
