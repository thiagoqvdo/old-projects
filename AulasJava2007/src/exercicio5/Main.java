/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.text.DecimalFormat;
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
        double sm = 788, su, qntdSM;
        DecimalFormat df = new DecimalFormat("0.00");
        
       su = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));
       qntdSM = su/sm;
       JOptionPane.showMessageDialog(null, "Você recebe " + df.format(qntdSM) + " salários mínimos");
       
    }
    
}
