/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author jecode
 */
public class Puhelinmuistio {
    
    private ArrayList<Henkilo> muistio;
    
    
    public Puhelinmuistio() {
        muistio = new ArrayList<Henkilo>();
    }
    
    public void lisaa(String nimi, String numero) {
        Henkilo h = new Henkilo(nimi, numero);
        
        if( !this.muistio.contains(h) ) {
            this.muistio.add(h);
        }
    }
    
    public void tulostaKaikki() {
        for(Henkilo h : muistio)
            System.out.println(h.toString());
    }
    
    public String haeNumero(String nimi) {
        for(Henkilo h : muistio) {
            if( h.haeNimi().matches(nimi)) {
                return h.haeNumero();
            }
        }
        
        return "numero ei tiedossa";
    }
    
}
