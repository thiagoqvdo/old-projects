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

/**
 *
 * @author jairb
 */
public class TJFrames extends JFrame implements ActionListener {

    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Form Aulas");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //José
        menuItem = new JMenuItem("Form. José",
                KeyEvent.VK_J);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("mJose");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Gabriel
        menuItem = new JMenuItem("Form. Gabriel",
                KeyEvent.VK_G);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("mGabriel");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Igor
        menuItem = new JMenuItem("Form. Igor",
                KeyEvent.VK_I);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_3, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("mIgor");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Thiago
        menuItem = new JMenuItem("Form. Thiago",
                KeyEvent.VK_T);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_4, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("mThiago");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Wilian
        menuItem = new JMenuItem("Form. Wilian",
                KeyEvent.VK_W);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_5, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("mWilian");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Yuri
        menuItem = new JMenuItem("Form. Yuri",
                KeyEvent.VK_Y);
        menuItem.setActionCommand("mYuri");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Jair
        menuItem = new JMenuItem("Form. Jair",
                KeyEvent.VK_Y);
        menuItem.setActionCommand("mJair");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        return menuBar;
    }

    public void actionPerformed(ActionEvent e) {
        if ("mJose".equals(e.getActionCommand())) {
            tjVitork jv = new tjVitork();
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mGabriel".equals(e.getActionCommand())) {
            jfGabriel gabriel = new jfGabriel();
            gabriel.setVisible(true);
            gabriel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mWilian".equals(e.getActionCommand())) {
            jfWilian wil = new jfWilian();
            wil.setVisible(true);
            wil.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mThiago".equals(e.getActionCommand())) {
            jfThiago thiago = new jfThiago();
            thiago.setVisible(true);
            thiago.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mIgor".equals(e.getActionCommand())) {
            jfThiago igor = new jfThiago();
            igor.setVisible(true);
            igor.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mYuri".equals(e.getActionCommand())) {
            JF_Yuri yuri = new JF_Yuri();
            yuri.setVisible(true);
            yuri.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mJair".equals(e.getActionCommand())) {
            jfJair jair = new jfJair();
            jair.setVisible(true);
            jair.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
        TJFrames demo = new TJFrames();
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
