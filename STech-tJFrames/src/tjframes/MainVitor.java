package tjframes;
 
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MainVitor extends JFrame implements ActionListener {
    JTextArea output;
    JScrollPane scrollPane;
    public JMenuBar createMenuBar() {
       JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem; 
        
        //Create the menu bar.
        menuBar = new JMenuBar();
        
        //Buld the first menu.
        menu = new JMenu("Form Aulas");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);
        
         //a group of JMenuItems
        menuItem = new JMenuItem("Form. Jose",
                                 KeyEvent.VK_T);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.setActionCommand("mJose");
        menuItem.addActionListener(this);
        menu.add(menuItem);
         
    
        menuItem = new JMenuItem("Form. Gabriel",
                                 KeyEvent.VK_T);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);
        menuItem.setActionCommand("mGabriel");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Form. Igor",
                                 KeyEvent.VK_T);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_3, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);
        menuItem.setActionCommand("mIgor");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Form. Thiago",
                                 KeyEvent.VK_T);
       
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_4, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);
        menuItem.setActionCommand("mThiago");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
         menuItem = new JMenuItem("Form. Wilian",
                                 KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_5, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);
        menuItem.setActionCommand("mWilian");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
                menuItem = new JMenuItem("Form. Yuri",
                                 KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_6, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);
        menuItem.setActionCommand("mYuri");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
         menuItem = new JMenuItem("Form. Jair",
                                 KeyEvent.VK_Y);
        menuItem.setActionCommand("mJair");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
    return menuBar;
    }
    public void actionPerformed(ActionEvent e ){
        if("mJose".equals(e.getActionCommand())){
           new tjVitork().setVisible(true);
        }
        if ("mGabriel".equals(e.getActionCommand())){
            new jfGabriel().setVisible(true);
        }
        if ("mWilian".equals(e.getActionCommand())){
            new jfWilian().setVisible(true);
        }
        if ("mThiago".equals(e.getActionCommand())){
            new jfThiago().setVisible(true);
        }
        if ("mIgor".equals(e.getActionCommand())){
            new jfThiago().setVisible(true);
        }
        if ("mYuri".equals(e.getActionCommand())){
            new JF_Yuri().setVisible(true);
        }
        if ("mJair".equals(e.getActionCommand())){
            new jfJair().setVisible(true);
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
        MainVitor demo = new MainVitor();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
 
        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

     //To change body of generated methods, choose Tools | Templates.
    } 
