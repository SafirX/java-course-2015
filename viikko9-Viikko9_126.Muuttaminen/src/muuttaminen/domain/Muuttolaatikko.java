/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muuttaminen.domain;

import java.util.*;
/**
 *
 * @author jecode
 */
public class Muuttolaatikko implements Tavara {

    
   
    private ArrayList<Tavara> tavarat = new ArrayList<Tavara>();
    private final int maxTilavuus;

    public Muuttolaatikko(int maxTilavuus) {
        this.maxTilavuus = maxTilavuus;
    }
    
    public boolean lisaaTavara(Tavara t) {
        if(getTilavuus()+t.getTilavuus() <= maxTilavuus) {
            tavarat.add(t);
            return true;
        }
        
        return false;
    }
   
    @Override
    public int getTilavuus() {
        int v = 0;
        for(Tavara t : tavarat) {
            v += t.getTilavuus();
        }
        
        return v;
    }
    
}
