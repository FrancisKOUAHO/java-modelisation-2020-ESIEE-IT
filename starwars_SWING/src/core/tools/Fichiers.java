/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.tools;

import fr.skyplus.others.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ldumay
 */

/**
 * Class - Fichiers
 <br>
 * <br>Constructor :
 * <br>- Fichiers()
 <br>
 * <br>Functions :
 * <br>- Fichiers.readFile(String text)
 * <br>  |--> void
 * <br>
 * <br>End.
 */
public class Fichiers {
    
    private String defaultPath = "src/file.txt";
    private String contentFile = "";
    
    /**
     * Constructor
     * 
     * Fichiers()
     */
    public Fichiers(){
        init();
    }
    
    /**
     * Constructor
     * 
     * Fichiers()
     * @param defaultPath
     */
    public Fichiers(String defaultPath){
        this.defaultPath = defaultPath;
        this.contentFile = "";
        init();
    }
    
    // The methods of basic getter below.
    public String getPathDefault() { return this.defaultPath; }
    public String getContentFile() { return this.contentFile; }
    
    // The methods of basic setter below.
    public void setPathDefault(String defaultPath) { this.defaultPath = defaultPath; }
    public void setContentFile(String contentFile) { this.contentFile = contentFile; }
    
    /**
     * Initialisation des méthodes nécessaires
     */
    private void init(){
        readFile();
    }
    
    /**
     * Lecture d'un fichier
     */
    private void readFile(){
        if(defaultPath!=null){
            try {
                int x = 0;
                File file = new File(this.defaultPath);
                Scanner readFile = new Scanner(file);
                while (readFile.hasNextLine()) {
                    String data = readFile.nextLine();
                    this.contentFile += x<=0 ? data : "\n"+data;
                    x++;
                }
                readFile.close();
            } catch (FileNotFoundException e) {
                Console.print("An error occurred.");
                e.printStackTrace();
            }
        } else { Console.print("defaultPath : "+defaultPath+"\nPlease configure this with setPathDefault(String defaultPath)."); }
    }
    
}
