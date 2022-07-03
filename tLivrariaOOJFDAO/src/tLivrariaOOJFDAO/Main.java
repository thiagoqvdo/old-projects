/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tLivrariaOOJFDAO;

import controler.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import view.*;

/**
 *
 * @author Thiago Quevedo
 */
public class Main extends JFrame implements ActionListener {

    public boolean openCli = false;
    public static CClientes cadCli = new CClientes();
    public static CEditoras cadEdi = new CEditoras();
    public static CLivros cadLiv = new CLivros();

    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Cadastros");
        menu.setMnemonic(KeyEvent.VK_C);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //Clientes
        menuItem = new JMenuItem("Clientes",
                KeyEvent.VK_C);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setActionCommand("mClientes");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Editoras
        menuItem = new JMenuItem("Editoras",
                KeyEvent.VK_E);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setActionCommand("mEditoras");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        //Livros
        menuItem = new JMenuItem("Livros",
                KeyEvent.VK_L);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setActionCommand("mLivros");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        return menuBar;
    }

    public void actionPerformed(ActionEvent e) {
        if ("mClientes".equals(e.getActionCommand())) {
            try {
                jfCliente jfc = new jfCliente();
                jfc.setVisible(true);
                jfc.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("mEditoras".equals(e.getActionCommand())) {
            try {
                jfEditora jfe = new jfEditora();
                jfe.setVisible(true);
                jfe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("mLivros".equals(e.getActionCommand())) {
            jfLivro jfl = new jfLivro();
            jfl.setVisible(true);
            jfl.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }

    }

//    addWindowListener( new WindowAdapter() { 
//
//    public void windowClosing(WindowEvent evt) {
//        if (JOptionPane.showConfirmDialog(null, "Deseja sair") == JOptionPane.OK_OPTION) {
//            openCli = false;
//        }
//    }
//}
//);

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
        Main demo = new Main();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());

        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
        
        
    }
         public static void main(String[] args) {
        
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
}
    }
