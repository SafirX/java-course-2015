/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilosto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jecode
 */
public class Tyontekijat {
    
    private ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
    
    public void lisaa(Henkilo h) {
        this.henkilot.add(h);
    }
    
    public void lisaa(List<Henkilo> lisattavat) {
        
        for(Henkilo h : lisattavat) {
            this.henkilot.add(h);
        }
        
    }
    
    public void tulosta() {
        Iterator<Henkilo> h = this.henkilot.iterator();
        
        while(h.hasNext()) {
            System.out.println(h.next());
        }
    }
    
    public void tulosta(Koulutus k) {
        Iterator<Henkilo> h = this.henkilot.iterator();
        
        while(h.hasNext()) {
            Henkilo hen = h.next();
            if(hen.getKoulutus().equals(k)) System.out.println(hen);
        }
    }
    
    public void irtisano(Koulutus k) {
        Iterator<Henkilo> h = this.henkilot.iterator();
        
        while(h.hasNext()) {
            Henkilo hen = h.next();
            if(hen.getKoulutus().equals(k)) h.remove();
        }
    }
    
}
