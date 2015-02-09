/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suosittelija.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Arvio;

/**
 *
 * @author jecode
 */
public class ElokuvaComparator implements Comparator<Elokuva> {

    private Map<Elokuva, List<Arvio>> lista;
    
    public ElokuvaComparator(Map<Elokuva, List<Arvio>> arviot) {
        lista = arviot;
    }

    @Override
    public int compare(Elokuva o1, Elokuva o2) {
       
        return keskiarvo(lista.get(o2)) - keskiarvo(lista.get(o1));

    }
    
    private int keskiarvo(List<Arvio> arviot) {
        
        int sum = 0;
        for(Arvio a : arviot) sum += a.getArvo();
        
        return sum / arviot.size();
    }
    
}
