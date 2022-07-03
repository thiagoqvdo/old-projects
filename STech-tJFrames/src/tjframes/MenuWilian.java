/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjframes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author wilian
 */
public class MenuWilian extends JFrame implements ActionListener {

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
        menu = new JMenu("Form Aulas");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //josé
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

        //gabriel
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

        //igor
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

        //thiago
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
                KeyEvent.VK_5);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_W, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("mWilian");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //yuri
        menuItem = new JMenuItem("Form. Yuri",
                KeyEvent.VK_Y);
        menuItem.setActionCommand("mYuri");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        return menuBar;
    }

    public void actionPerformed(ActionEvent e) {
        if ("mJose".equals(e.getActionCommand())) {
            tjVitork jose = new tjVitork();
            jose.setVisible(true);
            jose.setDefaultCloseOperation(MenuWilian.EXIT_ON_CLOSE);
            jose.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mGabriel".equals(e.getActionCommand())) {
            jfGabriel gabriel = new jfGabriel();
            gabriel.setVisible(true);
            gabriel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mThiago".equals(e.getActionCommand())) {
            jfThiago thiago = new jfThiago();
            thiago.setVisible(true);
            thiago.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mWilian".equals(e.getActionCommand())) {
            jfWilian wilian = new jfWilian();
            wilian.setVisible(true);
            wilian.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mYuri".equals(e.getActionCommand())) {
            JF_Yuri yuri = new JF_Yuri();
            yuri.setVisible(true);
            yuri.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
    }

    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Create a scrolled text area.
        output = new JTextArea(30, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        //imagem
        ImageIcon icon = createImageIcon("../imgs/teste.gif");
        jLabel = new JLabel(icon);
        contentPane.add(jLabel);

        //Add the text area to the content pane.
        //contentPane.add(scrollPane, BorderLayout.CENTER);
        return contentPane;
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Menu Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        MenuWilian demo = new MenuWilian();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());

        //Display the window.
        frame.setSize(480, 360);
        frame.setVisible(true);
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MenuWilian.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Imagem não encontrada ! : " + path);
            return null;
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
