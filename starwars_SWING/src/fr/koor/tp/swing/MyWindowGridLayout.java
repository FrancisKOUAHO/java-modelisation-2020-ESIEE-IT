/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.koor.tp.swing;

import java.awt.Dimension;
import java.awt.GridLayout;
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

public class MyWindowGridLayout extends JFrame{
    
    private static final long serialVersionUID = -728474938758L;

    /**
     * Constructor
     */
    public MyWindowGridLayout(){
        super("My Window Flow Layout");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
        
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new GridLayout(2, 2, 10, 10));
        
        JButton btnPushMe = new JButton("Push Me");
        btnPushMe.setBounds(200, 20, 160, 30);
        contentPane.add(btnPushMe);
        
        JButton btnClickMe = new JButton("Click Me !!!!!!");
        btnClickMe.setBounds(200, 70, 160, 30);
        contentPane.add(btnClickMe);
        
        JCheckBox btnCheckMe = new JCheckBox("Check Me !");
        btnCheckMe.setBounds(200, 120, 160, 30);
        contentPane.add(btnCheckMe);
        
        JTextField btnEditeMe = new JTextField("Edite Me !");
        btnEditeMe.setPreferredSize(new Dimension(120,30));
        contentPane.add(btnEditeMe);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Apply a look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        
        //Start my Window
        MyWindowGridLayout myWindowGridLayout = new MyWindowGridLayout();
        myWindowGridLayout.setVisible(true);
    }
    
}
