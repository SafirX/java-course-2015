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
public class Osallistuja implements Comparable<Osallistuja>{
    
    private final String nimi;
    private ArrayList<Hyppy> hypyt;

    public Osallistuja(String nimi) {
        this.nimi = nimi;
        this.hypyt = new ArrayList<Hyppy>();
    }
    
    public Hyppy hyppaa() {
        Hyppy h = new Hyppy();
        hypyt.add(h);
        report(h);
        return h;
    }
    
    private void report(Hyppy h) {
        System.out.printf("  %s\n"
                + "    pituus: %d\n"
                + "    tuomaripisteet: %s\n", this.nimi, h.pituus(), h);
    }
    
    public String nimi() {
        return nimi;
    }
    
    public String hypyt() {
        String ret = "";
        
        int i = 0;
        for(Hyppy h : hypyt) {
            ret += h.pituus() + " m";
            if(i < (hypyt.size()-1)) ret += ", ";
            i++;
        }
        
        return ret;
    }
    
    public int kokonaispisteet() {
        
        int p = 0;
        for(Hyppy h : hypyt) {
            p += h.yhteispisteet();
        }
        
        return p;
    }

    @Override
    public String toString() {
        return String.format("%s (%d pistettä)", this.nimi, kokonaispisteet());
    }

    @Override
    public int compareTo(Osallistuja o) {
        return kokonaispisteet() - o.kokonaispisteet();
    }
    
    
    
    
    
    
    
}
