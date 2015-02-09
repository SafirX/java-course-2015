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
public class Varasto {
    
    private Map<String,Integer> hinnat;
    private Map<String,Integer> saldot;

    public Varasto() {
        this.hinnat = new HashMap<String,Integer>();
        this.saldot = new HashMap<String,Integer>();
    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        
        hinnat.put(tuote, hinta);
        saldot.put(tuote, saldo);
        
    }
    
    public int hinta(String tuote) {
        
        if(saldot.get(tuote) == null || saldot.get(tuote) == 0) return -99;
        
        return hinnat.get(tuote);
        
    }
    
    public int saldo(String tuote) {
        
        if(saldot.get(tuote) == null) return 0;
        
        return saldot.get(tuote);
        
    }
    
    public Set<String> tuotteet() {
        
        HashSet<String> ret = new HashSet<String>();
        
        for(String s : saldot.keySet()) {
            ret.add(s);
        }
        
        return ret;
        
    }
    
    public boolean ota(String tuote) {
        if(saldot.get(tuote) == null) return false;
        
        int saldo = saldot.get(tuote);
        
        if(saldo > 0) {
            saldo--;
            saldot.put(tuote, saldo);
            return true;
        } 
        
        return false;
        
        
    }
    
    
    
}
