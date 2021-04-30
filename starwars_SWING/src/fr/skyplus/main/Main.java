package fr.skyplus.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {


    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Apply a look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        
        //Start my Window
        ViewLogin login = new ViewLogin();
        login.setVisible(true);
    }
    
}
