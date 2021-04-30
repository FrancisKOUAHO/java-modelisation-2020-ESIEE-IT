/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.abstracts;

import core.interfaces.Instrument;
import fr.skyplus.others.Console;

/**
 *
 * @author ldumay
 */
public class Percussion implements Instrument{
    
    @Override
    public void play(){ Console.print("Poum"); }
    
    @Override
    public String what(){ return null; }
    
    @Override
    public void adjust(){}
}