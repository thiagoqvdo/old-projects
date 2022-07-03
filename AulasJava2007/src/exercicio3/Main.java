/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

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
        double saldo;
        
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo: "));
        JOptionPane.showMessageDialog(null, "O saldo informado com o reajuste de 1% é igual a " + saldo*1.01);
    }
    
}
