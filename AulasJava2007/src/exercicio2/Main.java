/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double media1 = (8+9+7)/3, media2 = (4+5+6)/3, mediaSoma = media1+media2, mediaTotal = mediaSoma/2;
       
        
        JOptionPane.showMessageDialog(null, "Media aritmética dos números 8, 9 e 7: " + media1);
        JOptionPane.showMessageDialog(null, "Media aritmética dos números 4, 5 e 6: " + media2);
        JOptionPane.showMessageDialog(null, "A soma das duas médias é: " + mediaSoma);
        JOptionPane.showMessageDialog(null, "A média das duas médias é: " + mediaTotal);
        
    }
    
}
