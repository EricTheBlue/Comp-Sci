/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picturething;

/**
 *
 * @author winsore
 */
import java.text.*;
public class PictureThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double price8x10 = 2.50, price5x7 = 1.22, priceWalletSize = 0.33;
        
        int qty8x10 = 4367, qty5x7 = 5832, qtyWalletSize = 97578;
        
        double cost8x10 = price8x10 * qty8x10, cost5x7 = price5x7 * qty5x7, costWalletSize = priceWalletSize * qtyWalletSize;
        
        double total = cost8x10 + cost5x7 + costWalletSize;
        
        DecimalFormat $moneh = new DecimalFormat("$0.00");
        
        System.out.println("Item\t\tunit cost\tqty\t\tcost");
        System.out.println("8x10\t\t" + $moneh.format(price8x10) + "\t\t" + qty8x10 + "\t\t" + $moneh.format(cost8x10));
        System.out.println("5x7\t\t" + $moneh.format(price5x7) + "\t\t" + qty5x7 + "\t\t" + $moneh.format(cost5x7));
        System.out.println("wallet size\t" + $moneh.format(priceWalletSize) + "\t\t" + qtyWalletSize + "\t\t" + $moneh.format(costWalletSize));
        System.out.println();
        System.out.println("total\t\t\t\t\t\t" + $moneh.format(total));
        System.out.println();
        System.out.println("average per picture\t\t\t\t" + $moneh.format(total / (qty8x10 + qty5x7 + qtyWalletSize)));
        
    }
    
}
