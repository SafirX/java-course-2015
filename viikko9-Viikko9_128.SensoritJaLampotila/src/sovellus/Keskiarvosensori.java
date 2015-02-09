/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.*;


/**
 *
 * @author jecode
 */
public class Keskiarvosensori implements Sensori {
    
    private ArrayList<Sensori> sensorit = new ArrayList<Sensori>();
    private ArrayList<Integer> mittaukset = new ArrayList<Integer>();
    
    public void lisaaSensori(Sensori lisattava) {
        sensorit.add(lisattava);
    }
    
    public List<Integer> mittaukset() {
        return mittaukset;        
    }

    @Override
    public boolean onPaalla() {
        for(Sensori s : sensorit) {
            if(!s.onPaalla()) return false;
        }
        
        return true;
    }

    @Override
    public void paalle() {
        for(Sensori s : sensorit)
            s.paalle();
    }

    @Override
    public void poisPaalta() {
        for(Sensori s : sensorit)
            s.poisPaalta();
    }

    @Override
    public int mittaa() {
        if( !this.onPaalla() || sensorit.size() < 1 ) throw new IllegalStateException();
        
        int sum = 0;
        for(Sensori s : sensorit) {
            sum += s.mittaa();
        }
        int ka = (sum / sensorit.size());
        mittaukset.add(ka);
        return ka;
    }
    
}
