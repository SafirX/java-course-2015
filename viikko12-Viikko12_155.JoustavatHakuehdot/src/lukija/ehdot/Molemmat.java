/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lukija.ehdot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jecode
 */
public class Molemmat implements Ehto {

    private final List<Ehto> ehdot =  new ArrayList<Ehto>();

    public Molemmat(Ehto a, Ehto b) {
        ehdot.add(a);
        ehdot.add(b);
    }
    
    
    
    @Override
    public boolean toteutuu(String rivi) {
        for(Ehto e : this.ehdot) {
            if(!e.toteutuu(rivi)) return false;
        }
        
        return true;
    }
    
}
