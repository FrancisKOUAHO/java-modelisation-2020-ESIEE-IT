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
 * Class - Calcul
 * <br>
 * <br>- public ArrayList visite
 * <br>
 * <br>Constructor :
 * <br>- Calcul()
 * <br>- Calcul(int varA, int varB)
 * <br>
 * <br>Functions :
 * <br>- Calcul.addition()
 * <br>  |--> Return int
 * <br>- Calcul.addition(int varA, int varB)
 * <br>  |--> Return int
 * <br>- Calcul.soustraction()
 * <br>  |--> Return int
 * <br>- Calcul.soustraction(int varA, int varB)
 * <br>  |--> Return int
 * <br>- Calcul.multiplication()
 * <br>  |--> Return int
 * <br>- Calcul.multiplication(int varA, int varB)
 * <br>  |--> Return int
 * <br>- Calcul.division()
 * <br>  |--> Return int
 * <br>- Calcul.division(int varA, int varB)
 * <br>  |--> Return int
 * <br>
 * <br>Basic setter :
 * <br>- getVarA()
 * <br>- getVarB()
 * <br>- setVarA()
 * <br>- setVarA()
 * <br>
 * <br>End.
 */
public class Calcul {

    private int varA = 0;
    private int varB = 0;
    
    /**
     * Constructor
     * 
     * Calcul()
     */
    public Calcul() {}
    
    /**
     * Constructor
     * 
     * Calcul(int varA, int varB)
     * @param varA
     * @param varB
     */
    public Calcul(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // The methods of basic getter below.
    public int getVarA(){ return this.varA; }
    public int getVarB(){ return this.varB; }
    
    // The methods of basic setter below.
    public void setVarA(int varA){ this.varA = varA; }
    public void setVarB(int varB){ this.varB = varB; }
    
    /**
     * Addition des 2 entiers de la classe saisi par les setters
     * 
     * @return
     */
    public int addition(){ return this.varA+this.varB; }
    
    /**
     * Addition de nouveaus 2 entiers
     * 
     * @param varA
     * @param varB
     * @return
     */
    public int addition(int varA, int varB){ return varA+varB; }
    
    /**
     * Soustraction des 2 entiers de la classe saisi par les setters
     * 
     * @return
     */
    public int soustraction(){ return this.varA-this.varB; }
    
    /**
     * Soustraction de 2 nouveaux entiers
     * 
     * @param varA
     * @param varB
     * @return
     */
    public int soustraction(int varA, int varB){ return varA-varB; }

    /**
     * Mutiplication des 2 entiers de la classe saisi par les setters
     * 
     * @return
     */
    public int multiplication(){ return this.varA*this.varB; }

    /**
     * Mutiplication de 2 nouveaux entiers
     * 
     * @param varA
     * @param varB
     * @return
     */
    public int multiplication(int varA, int varB){ return varA*varB; }
    
    /**
     * Division des 2 entiers de la classe saisi par les setters
     * 
     * @return
     */
    public double division(){
        return this.varA==0 || this.varB==0 ? 0 : this.varA/this.varB;
    }
    
    /**
     * Division de 2 nouveaux entiers de la classe saisi par les setters
     * 
     * @param varA
     * @param varB
     * @return
     */
    public double division(int varA, int varB){
        return (varA==0||varB==0) ? 0 : varA/varB;
    }
    
    @Override
    public String toString(){ return this.varA+" / "+this.varB; }
}
