/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastot;

import java.util.*;

/**
 *
 * @author jecode
 */
public class Muutoshistoria {

    private ArrayList<Double> muutokset = new ArrayList<Double>();
    
    public Muutoshistoria() {
    }
    
    public void lisaa(double tilanne) {
        this.muutokset.add(tilanne);
    }
    
    public void nollaa() {
        this.muutokset.clear();
    }
    
    @Override
    public String toString() {
        return this.muutokset.toString();
    }
    
    public double maxArvo() {
        return Collections.max(muutokset);
    }
    
    public double minArvo() {
        return Collections.min(muutokset);
    }
    
    public double keskiarvo() {
        double sum = 0.0;
        for(double d : muutokset) {
            sum += d;
        }
        return sum / muutokset.size();
    }
    
    public double suurinMuutos() {
        
        if(muutokset.size() < 2) return 0.0;
        
        double suurin = 0;
        double last = muutokset.get(0);
        
        for(double d : muutokset) {
            if(Math.abs(d-last) > suurin) {
                suurin = Math.abs(d-last);
            }
            last = d;
        }
        
        return suurin;
    }
    
    public double varianssi() {
        
        double ka = keskiarvo();
        
        double varianssi = 0.0;
        
        for(double d : muutokset) {
            varianssi += Math.pow((d - ka),2);
        }
        
        return (varianssi/(muutokset.size()-1));
    }
    
    
    

    
}
