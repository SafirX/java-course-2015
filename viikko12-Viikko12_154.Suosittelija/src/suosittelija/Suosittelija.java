/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suosittelija;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Henkilo;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Arvio;
import suosittelija.ArvioRekisteri;
import suosittelija.comparator.ElokuvaComparator;

/**
 *
 * @author jecode
 */
public class Suosittelija {
    
    private final ArvioRekisteri rekisteri;

    public Suosittelija(ArvioRekisteri rekisteri) {
        this.rekisteri = rekisteri;
    }

    public Elokuva suositteleElokuva(Henkilo henkilo) {
        Map<Elokuva, List<Arvio>> arviot = (HashMap<Elokuva,List<Arvio>>)rekisteri.elokuvienArviot();

        List<Elokuva> leffat = rekisteri.leffat();
        
        Collections.sort(leffat, new ElokuvaComparator(arviot));
        
        return leffat.get(0);
    }
    
}
