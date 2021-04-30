/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.tools;

import java.util.ArrayList;

/**
 *
 * @author ldumay
 */

/**
 * Class - DateConversion
 * <br>
 * <br>- public ArrayList visite
 * <br>
 * <br>Constructor :
 * <br>- Planning()
 * <br>
 * <br>Functions :
 * <br>- DateConversion.dateConvertTypeDate(Date date, Locale localeSelected)
 * <br>  |--> Return String
 * <br>
 * <br>Basic setter :
 * <br>- setVisite()
 * <br>
 * <br>End.
 */
public class Planning {
    
    public ArrayList<Visite> visites;
    
    /**
     * Constructor
     * 
     * Planning()
     */
    public Planning() { this.visites = new ArrayList(); }
    
    /**
     * Constructor
     * 
     * Planning(ArrayList visite)
     * @param visite
     */
    public Planning(ArrayList visite) { this.visites = visite; }
    
    // The methods of basic getter below.
    public ArrayList getVisite() { return visites; }

    // The methods of basic setter below.
    public void setVisite(ArrayList visite) { this.visites = visite; }
    
    /**
     * Adding a visit from the list of visits.
     * 
     * @param visite Visite
     */
    public void addVisite(Visite visite){ this.visites.add(visite); }

    /**
     * Deleting a visit from the list of visits.
     * 
     * @param visite Visite
     */
    public void removeVisite(Visite visite){ this.visites.remove(visite); }    
    
    @Override
    public String toString(){
        int x = 0;
        String toString;
        if(visites.size()>0){
            toString = "";
            for(Visite visite : visites){
                if(x==0){
                    toString += visite;
                } else { toString += " - "+visite; }
                x++;
            }
        } else { toString = "planning vide"; }
        return toString;
    }
    
}
