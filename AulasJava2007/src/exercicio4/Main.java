/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

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
        double porcentagem, valor1, valor2, valorTotal;
        int cod1, cod2, qntd1, qntd2;
        
        porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do IPI a ser acrescentado: "));
        cod1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da peça 1: "));
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário da peça 1: "));
        qntd1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade da peça 1: "));
        
        
        cod2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da peça 2: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário da peça 2: "));
        qntd2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade da peça 2: "));
                
        valorTotal = (valor1*qntd1+valor2*qntd2)*(porcentagem/100 + 1);
        
        JOptionPane.showMessageDialog(null, "O valor total a ser pago é " + valorTotal);
    }
    
}
