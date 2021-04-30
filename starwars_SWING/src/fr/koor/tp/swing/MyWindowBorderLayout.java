/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.koor.tp.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author ldumay
 */

public class MyWindowBorderLayout extends JFrame{
    
    private static final long serialVersionUID = -728474938758L;

    /**
     * Constructor
     */
    public MyWindowBorderLayout(){
        super("My Window Flow Layout");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
        
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        JButton btnPushMe = new JButton("Push Me");
        contentPane.add(btnPushMe, BorderLayout.NORTH);
        
        JButton btnClickMe = new JButton("Click Me !!!!!!");
        contentPane.add(btnClickMe, BorderLayout.WEST);
        
        JCheckBox btnCheckMe = new JCheckBox("Check Me !");
        contentPane.add(btnCheckMe, BorderLayout.SOUTH);
        
        JTextField btnEditeMe = new JTextField("Edite Me !");
        contentPane.add(btnEditeMe);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Apply a look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        
        //Start my Window
        MyWindowBorderLayout myWindowBorderLayout = new MyWindowBorderLayout();
        myWindowBorderLayout.setVisible(true);
    }
    
}
