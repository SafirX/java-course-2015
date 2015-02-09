/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suosittelija;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Henkilo;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Arvio;

/**
 *
 * @author jecode
 */
public class ArvioRekisteri {

    private Map<Elokuva,List<Arvio>> arviot = new HashMap<Elokuva, List<Arvio>>();
    
    private Map<Henkilo,Map<Elokuva,Arvio>> henkiloArviot = new HashMap<Henkilo, Map<Elokuva, Arvio>>();
    
    public ArvioRekisteri() {
        
    }
    
    public void lisaaArvio(Elokuva elokuva, Arvio arvio) {
        if(arviot.containsKey(elokuva)) arviot.get(elokuva).add(arvio);
        else {
            arviot.put(elokuva, new ArrayList<Arvio>());
            arviot.get(elokuva).add(arvio);
        }
    }
    
    public void lisaaArvio(Henkilo henkilo, Elokuva elokuva, Arvio arvio) {
        if(henkiloArviot.get(henkilo) == null) {
            henkiloArviot.put(henkilo, new HashMap<Elokuva, Arvio>());
            henkiloArviot.get(henkilo).put(elokuva, arvio);
        } else {
            henkiloArviot.get(henkilo).put(elokuva, arvio);
        }
        
        lisaaArvio(elokuva, arvio);
    }
    
    public Arvio haeArvio(Henkilo henkilo, Elokuva elokuva) {
        if(henkiloArviot.get(henkilo).get(elokuva) == null) return Arvio.EI_NAHNYT;
        else return henkiloArviot.get(henkilo).get(elokuva);
    }
    
    public Map<Elokuva,Arvio> annaHenkilonArviot(Henkilo henkilo) {
        if(henkiloArviot.get(henkilo) == null) return new HashMap<Elokuva,Arvio>();
        
        return henkiloArviot.get(henkilo);
    }
    
    public List<Henkilo> arvioijat() {
        ArrayList<Henkilo> result = new ArrayList<Henkilo>();
        
        for(Henkilo h : henkiloArviot.keySet())
            result.add(h);
        
        return result;
    }
    
    public List<Elokuva> leffat() {
        ArrayList<Elokuva> result = new ArrayList<Elokuva>();
        
        for(Elokuva e : this.arviot.keySet()) {
            result.add(e);
        }
        
        return result;
    }
    
    public List<Arvio> annaArviot(Elokuva elokuva) {
        if( arviot.get(elokuva) != null) return arviot.get(elokuva);
        
        return new ArrayList<Arvio>();
    }
    
    public Map<Elokuva, List<Arvio>> elokuvienArviot() {
        return this.arviot;
    }
    
}
