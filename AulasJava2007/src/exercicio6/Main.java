/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

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
        int numero;
        int resposta;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        JOptionPane.showMessageDialog(null, "O antecessor é " + (numero - 1) + "\n"+ "O sucessor é " + (numero + 1));
        
        
    }
    
}
