/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjframes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.JLabel;

/**
 *
 * @author Yuri
 */
public class YuriMeinus extends JFrame implements ActionListener {
    JTextArea output;
    JScrollPane scrollPane;
    JLabel jLabel;
    
    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
 
        //Create the menu bar.
        menuBar = new JMenuBar();
 
        //Build the first menu.
        menu = new JMenu("Auuulas Formação");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);
        
        /*José*/
         //a group of JMenuItems
        menuItem = new JMenuItem("Forme-te, José!",
                                 KeyEvent.VK_J);
        
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("menuJose");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        /*Yuri*/
         //a group of JMenuItems
        menuItem = new JMenuItem("Forme-te, eu!",
                                 KeyEvent.VK_Y);
        
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("menuYuri");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        
        /*William*/
         //a group of JMenuItems
        menuItem = new JMenuItem("Forme-te, Willian!",
                                 KeyEvent.VK_W);
        
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_3, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("menuWilian");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        /*Igor*/
         //a group of JMenuItems
        menuItem = new JMenuItem("Forme-te, Igor!",
                                 KeyEvent.VK_I);
        
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_4, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("menuIgor");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        /*Thiago*/
         //a group of JMenuItems
        menuItem = new JMenuItem("Forme-te, Thiago!",
                                 KeyEvent.VK_T);
        
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_5, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("menuThiago");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        /*Gabriel*/
         //a group of JMenuItems
        menuItem = new JMenuItem("Forme-te, Gabriel!",
                                 KeyEvent.VK_G);
        
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_6, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("menuGabriel");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        return menuBar;
}
    
    public void actionPerformed(ActionEvent e) {
        if ("menuJose".equals(e.getActionCommand())) {
            tjVitork jose = new tjVitork();
            jose.setVisible(true);
            jose.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("menuGabriel".equals(e.getActionCommand())) {
            jfGabriel gabriel = new jfGabriel();
            gabriel.setVisible(true);
            gabriel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("menuThiago".equals(e.getActionCommand())) {
            jfThiago thiago = new jfThiago();
            thiago.setVisible(true);
            thiago.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("menuWilian".equals(e.getActionCommand())) {
            jfWilian wilian = new jfWilian();
            wilian.setVisible(true);
            wilian.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("menuYuri".equals(e.getActionCommand())) {
            JF_Yuri yuri = new JF_Yuri();
            yuri.setVisible(true);
            yuri.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("menuIgor".equals(e.getActionCommand())) {
            /*à espera de arquivos de igor */
        }
    }
    
    
     public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);
 
        //Create a scrolled text area.
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
 
        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);
 
        return contentPane;
}
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Painel Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        YuriMeinus demo = new YuriMeinus();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
 
        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        
        
    }
    
    
}
    