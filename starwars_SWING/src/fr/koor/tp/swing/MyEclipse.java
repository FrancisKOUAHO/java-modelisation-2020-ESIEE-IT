/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.koor.tp.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author ldumay
 */

public class MyEclipse extends JFrame{
    
    private static final long serialVersionUID = -728474938758L;

    /**
     * Constructor
     */
    public MyEclipse(){
        super("My Window Flow Layout");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
        
        JPanel contentPane = (JPanel) this.getContentPane();
        //contentPane.setLayout(new BorderLayout());
        
        contentPane.add(createToolBar(), BorderLayout.NORTH);
        
        JScrollPane westComponent = new JScrollPane(new JTree());
        westComponent.setPreferredSize(new Dimension(200, 0));
        contentPane.add(westComponent, BorderLayout.WEST);
        
        JTextArea txtCentent = new JTextArea("The content of this editor");
        JScrollPane srcCentent = new JScrollPane(txtCentent);
        contentPane.add(srcCentent);
        
        contentPane.add(createRightPanel(), BorderLayout.EAST);
        
        contentPane.add(createStatutBar(), BorderLayout.SOUTH);
    }
    
    private JToolBar createToolBar(){
        JToolBar toolBar = new JToolBar();
        
        JButton btnPushMe = new JButton("Push Me");
        toolBar.add(btnPushMe, BorderLayout.NORTH);
        
        JButton btnClickMe = new JButton("Click Me !!!!!!");
        toolBar.add(btnClickMe, BorderLayout.WEST);
        
        JCheckBox btnCheckMe = new JCheckBox("Check Me !");
        toolBar.add(btnCheckMe, BorderLayout.SOUTH);
        
        JTextField btnEditeMe = new JTextField("Edite Me !");
        btnEditeMe.setPreferredSize(new Dimension(140, 30));
        toolBar.add(btnEditeMe, BorderLayout.SOUTH);
        
        return toolBar;
    }
    
    private JPanel createStatutBar(){
        JPanel statutBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        JLabel lblStatus1 = new JLabel("Message 1");
        lblStatus1.setPreferredSize(new Dimension(140, 30));
        statutBar.add(lblStatus1);
        
        JLabel lblStatus2 = new JLabel("Message 2");
        lblStatus2.setPreferredSize(new Dimension(140, 30));
        statutBar.add(lblStatus2);
        
        JLabel lblStatus3 = new JLabel("Message 3");
        lblStatus3.setPreferredSize(new Dimension(140, 30));
        statutBar.add(lblStatus3);
        
        return statutBar;
    }
    
    private JPanel createRightPanel(){
        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add( new JButton("Button 1"));
        panel.add( new JButton("Button 2"));
        panel.add( new JButton("Button 3"));
        panel.add( new JButton("Button 4"));
        return panel;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Apply a look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        
        //Start my Window
        MyEclipse myEclipse = new MyEclipse();
        myEclipse.setVisible(true);
    }
    
}
