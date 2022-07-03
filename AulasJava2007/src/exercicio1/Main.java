/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Main {

    public static void main(String[] args) {
        Calcular c = new Calcular ();
        Scanner ler = new Scanner (System.in);
        c.anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem: "));
        c.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses você tem: "));
        c.dias = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias você tem: "));
        
        JOptionPane.showMessageDialog(null, c.calculaDiasTotais());
                

    }
    
}
