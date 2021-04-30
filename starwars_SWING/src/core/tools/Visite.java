/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.tools;

/**
 *
 * @author ldumay
 */

/**
 * Class - Visite
 * <br>
 * <br>Variables class :
 * <br>
 * <br>- public String nomDuVisiteur
 * <br>- public String dateDeNaissanceDuVisiteur
 * <br>- public String noteDuVisteur
 * <br>
 * <br>Constructor :
 * <br>- Visite()
 * <br>- Visite(String nomDuVisiteur, String dateDeNaissanceDuVisiteur, int noteDuVisteur)
 * <br>
 * <br>Basic getter :
 * <br>- getNomDuVisiteur();
 * <br>  |--> Return String
 * <br>- getDateDeNaissanceDuVisiteur();
 * <br>  |--> Return String
 * <br>- getNoteDuVisteur();
 * <br>  |--> Return int
 * <br>
 * <br>Basic setter :
 * <br>- setNomDuVisiteur(String nomDuVisiteur)
 * <br>- setDateDeNaissanceDuVisiteur(String dateDeNaissanceDuVisiteur)
 * <br>- setNoteDuVisteur(int noteDuVisteur)
 * <br>
 * <br>End.
 */
public class Visite {

    public String nomDuVisiteur = "Brian";
    public String dateDeNaissanceDuVisiteur = "1987-10-05";
    public int noteDuVisteur = 20;

    /**
     * Constructor
     * 
     * Visite()
     */
    public Visite(){}
    
    /**
     * Constructor
     * 
     * Visite(String nomDuVisiteur, String dateDeNaissanceDuVisiteur, int noteDuVisteur)
     * @param nomDuVisiteur
     * @param dateDeNaissanceDuVisiteur
     * @param noteDuVisteur
     */
    public Visite(String nomDuVisiteur, String dateDeNaissanceDuVisiteur, int noteDuVisteur) {
        this.nomDuVisiteur = nomDuVisiteur;
        this.dateDeNaissanceDuVisiteur = dateDeNaissanceDuVisiteur;
        this.noteDuVisteur = noteDuVisteur;
    }
    
    // The methods of basic getter below.
    public String getNomDuVisiteur() { return nomDuVisiteur; }
    public String getDateDeNaissanceDuVisiteur() { return dateDeNaissanceDuVisiteur; }
    public int getNoteDuVisteur() { return noteDuVisteur; }
    
    // The methods of basic setter below.
    public void setNomDuVisiteur(String nomDuVisiteur) { this.nomDuVisiteur = nomDuVisiteur; }
    public void setDateDeNaissanceDuVisiteur(String dateDeNaissanceDuVisiteur) { this.dateDeNaissanceDuVisiteur = dateDeNaissanceDuVisiteur; }
    public void setNoteDuVisteur(int noteDuVisteur) { this.noteDuVisteur = noteDuVisteur; }
    
    @Override
    public String toString(){ return this.nomDuVisiteur+" "+this.dateDeNaissanceDuVisiteur+" "+this.noteDuVisteur; }
    
}