/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muuttaminen.logiikka;

import java.util.*;
import muuttaminen.domain.Tavara;
import muuttaminen.domain.Muuttolaatikko;
/**
 *
 * @author jecode
 */
public class Pakkaaja {

    private final int tilavuus;
    
    public Pakkaaja(int tilavuus) {
        this.tilavuus = tilavuus;
    }
    
    public List<Muuttolaatikko> pakkaaTavarat(List<Tavara> tavarat) {
        ArrayList<Muuttolaatikko> boxit = new ArrayList<Muuttolaatikko>();
        
        Muuttolaatikko box = new Muuttolaatikko(tilavuus);
        for(Tavara t : tavarat) {
            
            if(!box.lisaaTavara(t)) {
                boxit.add(box);
                box = new Muuttolaatikko(tilavuus);
                box.lisaaTavara(t);
            }
        }
        boxit.add(box);
        return boxit;
    }
    
    
    
}
