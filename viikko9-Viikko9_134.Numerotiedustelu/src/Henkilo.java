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
public class Henkilo implements Comparable<Henkilo>{
    private final String nimi;

    private HashSet<String> numerot = new HashSet<String>();
    
    private String osoite = "";
    
    // Luodaan henkilo
    public Henkilo(String nimi) {
        this.nimi = nimi;
    }
    
    // Luodaan henkilo numerolla
    public Henkilo(String nimi, String numero) {
        this.nimi = nimi;
        this.numerot.add(numero);
    }
    
    public void lisaaNumero(String numero) {
        numerot.add(numero);
    }
    
    public void lisaaOsoite(String osoite) {
        this.osoite = osoite;
    }
    
    public HashSet<String> numerot() {
        return numerot;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    public String osoite() {
        return this.osoite;
    }
    
    public boolean match(String haku) {
        if (this.nimi.contains(haku)) return true;
        if (this.osoite.contains(haku)) return true;
        
        return false;
    }
        
    public String tiedot() {
        String line = "";
        line += "  osoite" + (this.osoite.isEmpty()?" ei tiedossa":": "+this.osoite) + "\n";
        
        if(numerot.size() > 0) {
            for(String puh : numerot) {
                line += "  " + puh + "\n";
            }
        } else {
            line += "  ei puhelinta";
        }
        
        return line; 
    }
        

    @Override
    public String toString() {
        String line = " "+this.nimi+"\n";
        line += tiedot();
        
        return line;
    }

    @Override
    public int compareTo(Henkilo o) {
        return this.nimi.compareTo(o.nimi());
    }
    
    
    
    
}
