/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suosittelija.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import suosittelija.domain.Henkilo;

/**
 *
 * @author jecode
 */
public class HenkiloComparator implements Comparator<Henkilo>{

    private Map<Henkilo,Integer> samuudet;
    
    public HenkiloComparator(Map<Henkilo,Integer> samuudet) {
        this.samuudet = samuudet;
    }

    
    @Override
    public int compare(Henkilo o1, Henkilo o2) {
        return samuudet.get(o2) - samuudet.get(o1);
    }
    
}
