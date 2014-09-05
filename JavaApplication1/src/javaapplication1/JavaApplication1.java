/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author winsore
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("   J      A    V     V   A   ");
        System.out.println("   J     A A    V   V   A A  ");
        System.out.println("J  J    AAAAA    V V   AAAAA ");
        System.out.println(" JJ    A     A    V   A     A");
        System.out.println();
        System.out.println("a        a^2      a^3");
        System.out.println("1        1        1  ");
        System.out.println("2        4        8  ");
        System.out.println("3        9        27 ");
        System.out.println("4        16       64 ");
    }
    public static double nPower(double x, int n) {
        double product = 1;
        for (int a=0; a<n; a++) {
            product *= x;
        }
        return product;
    }
    
}
