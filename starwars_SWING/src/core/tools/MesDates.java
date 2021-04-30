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
 * Class - MesDates
 * <br>
 * <br>Constructor :
 * <br>- MesDates()
 * <br>
 * <br>Functions :
 * <br>- MestDates.dateFRtoUS(String date)
 * <br>  |--> Return String
 * <br>
 * <br>- MestDates.dateFRtoUS(String date)
 * <br>  |--> Return String
 * <br>
 * <br>End.
 */
public class MesDates {
    
    /**
     * Constructor
     */
    public MesDates(){}
    
    /**
     * Conversion String Date FR to US.
     * 
     * @param date String
     * @return newDate type String
     */
    public String dateFRtoUS(String date){
        String[] dateHash = date.split("/");
        String year = dateHash[2];
        String month = dateHash[1];
        String day = dateHash[0];
        String newDate = year+"-"+month+"-"+day;
        return newDate;
    }
    
    /**
     * Conversion String Date US to FR.
     * 
     * @param date - String
     * @return newDate - type String
     */
    public String dateUStoFR(String date){
        String[] dateHash = date.split("-");
        String year = dateHash[0];
        String month = dateHash[1];
        String day = dateHash[2];
        String newDate = day+"/"+month+"/"+year;
        return newDate;
    }
}
