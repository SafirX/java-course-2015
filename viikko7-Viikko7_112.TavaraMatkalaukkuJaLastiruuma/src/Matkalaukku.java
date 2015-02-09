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
public class Matkalaukku {

    private final int maxPaino;
    
    private Tavara painavin;
    
    private ArrayList<Tavara> sisalto;
    
    public Matkalaukku(int maxPaino) {
        this.maxPaino = maxPaino;
        this.sisalto = new ArrayList<Tavara>();
    }
    
    public void lisaaTavara(Tavara t) {
        if(t.getPaino() + this.paino() <= this.maxPaino) {
            sisalto.add(t);
            
            if(painavin == null) painavin = t;
            
            if(t.getPaino() > painavin.getPaino()) 
                painavin = t;
        }
    }
    
    public void tulostaTavarat() {
        for(Tavara t : sisalto) {
            System.out.println(t.toString());
        }
    }
    
    public int yhteispaino() {
        return this.paino();
    }
    
    private int paino() {
        int p = 0;
        for(Tavara t : sisalto) {
            p += t.getPaino();
        }
        return p;
    }
    
    public Tavara raskainTavara() {
        if(sisalto.isEmpty()) return null;
        
        return this.painavin;
    }
    
    @Override
    public String toString() {
        switch(sisalto.size()) {
            case 0:
                return "ei tavaroita (0 kg)";
            case 1:
                return String.format("1 tavara (%d kg)", this.paino());
        }
        return String.format("%d tavaraa (%d kg)", sisalto.size(), this.paino());
    }
}
