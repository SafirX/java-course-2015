/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author jecode
 */
public class Ajoneuvorekisteri {
    
    private HashMap<Rekisterinumero, String> rekisteri;

    public Ajoneuvorekisteri() {
        rekisteri = new HashMap<Rekisterinumero, String>();
    }
    
    public boolean lisaa(Rekisterinumero rek, String omistaja) {
        
        if(!rekisteri.containsKey(rek)) {
            rekisteri.put(rek,omistaja);
            return true;
        }
        
        return false;
    }
    
    public String hae(Rekisterinumero rek) {
        String owner = rekisteri.get(rek);
        
        if( owner == null) return null;
        
        return owner;
    }
    
    public boolean poista(Rekisterinumero rek) {
        
        if(rekisteri.containsKey(rek)) {
            rekisteri.remove(rek);
            return true;
        }
        
        return false;
    }
    
    public void tulostaRekisterinumerot() {
        
        for(Rekisterinumero r : rekisteri.keySet()) {
            System.out.println(r);
        }
        
    }
    
    public void tulostaOmistajat() {
        
        ArrayList<String> nimet = new ArrayList<String>();
        
        for(Rekisterinumero r : rekisteri.keySet()) {
            if(!nimet.contains(rekisteri.get(r))) {
                System.out.println(rekisteri.get(r));
                nimet.add(rekisteri.get(r));
            }
            
        }
    }
    
    
    
    
    
}
