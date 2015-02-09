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
public class Lastiruuma {
    
    
    private final int maxPaino;
    
    private ArrayList<Matkalaukku> ruuma;
    
    public Lastiruuma(int maxPaino) {
        this.maxPaino = maxPaino;
        
        this.ruuma = new ArrayList<Matkalaukku>();
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        
        if(mahtuuko(laukku)) ruuma.add(laukku);
        
    }
    
    public boolean mahtuuko(Matkalaukku l) {
        return (this.paino()+l.yhteispaino() <= this.maxPaino);
        
    }
    
    private int paino() {
        int p = 0;
        
        for( Matkalaukku m : ruuma) {
            p += m.yhteispaino();
        }
        
        return p;
    }
    
    public void tulostaTavarat() {
        
        for(Matkalaukku m : ruuma) {
            m.tulostaTavarat();
        }
        
    }
    
    @Override
    public String toString() {
        return String.format("%d matkalaukkua (%d kg)", ruuma.size(), paino());
    }
}
