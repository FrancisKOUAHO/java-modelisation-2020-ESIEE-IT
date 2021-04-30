/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.koor.tp.swing.listeners;

import fr.skyplus.others.Console;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class MyWindowListener3 extends JFrame implements ActionListener{
    
    private static final long serialVersionUID = -728474938758L;
    
    private JButton btnPushMe = new JButton("Push Me");
    private JButton btnClickMe = new JButton("Click Me !!!!!!");
    private JCheckBox btnCheckMe = new JCheckBox("Check Me !");
    private JTextField btnEditeMe = new JTextField("Edite Me !");

    /**
     * Constructor
     */
    public MyWindowListener3(){
        super("My Window Flow Layout");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
        
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        
        btnPushMe.setBounds(200, 20, 160, 30);
        btnPushMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPushListener(e);
            }
        });
        contentPane.add(btnPushMe);
        
        btnClickMe.setBounds(200, 70, 160, 30);
        btnClickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Console.print("Click Me - Bouton cliqué !");
            }
        });
        contentPane.add(btnClickMe);
        
        btnCheckMe.setBounds(200, 120, 160, 30);
        contentPane.add(btnCheckMe);
        
        btnEditeMe.setPreferredSize(new Dimension(120,30));
        contentPane.add(btnEditeMe);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if( (JButton) event.getSource() == btnPushMe ){
            Console.print("Push Me - Bouton cliqué !");
        } else {
            Console.print("Click Me - Bouton cliqué !");
        }
    }
    
    private void btnPushListener(ActionEvent e){
        btnClickMe.setText("ouille");
        Console.print("Push Me - Bouton cliqué !");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Apply a look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        
        //Start my Window
        MyWindowListener3 myWindowFlowLayout = new MyWindowListener3();
        myWindowFlowLayout.setVisible(true);
    }
    
}
