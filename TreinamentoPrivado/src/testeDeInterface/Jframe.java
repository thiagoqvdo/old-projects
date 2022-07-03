/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeDeInterface;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



/**
 *
 * @author Thiago
 */
public class Jframe {
    public static void main(String[] args) {
        Painel painel = new Painel();
 JFrame janela = new JFrame("Meu primeiro frame em Java");
 janela.setBounds(440, 210, 600, 400);
 janela.add(painel);
 janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
 FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
 
 Container caixa = janela.getContentPane();
        
    caixa.setLayout(flow);
    JLabel label = new JLabel ("Exemplo de texto:");
    caixa.add(label);
        JTextField campo = new JTextField(15);
        caixa.add(campo);
        JButton button = new JButton("Clique");
        caixa.add(button);
        janela.pack();
 
 janela.setVisible(true);
    }
}

