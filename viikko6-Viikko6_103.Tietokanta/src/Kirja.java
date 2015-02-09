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
public class Kirja {
    
    ArrayList<Lintu> lista;
    
    
    public Kirja () {
        this.lista = new ArrayList<Lintu>();
    }
    
    public void lisaa(Lintu l) {
        if(!this.lista.contains(l)) {
            this.lista.add(l);
        }
    }
    
    public boolean havaitse(String lintu) {
        
        for(Lintu l : this.lista) {
            if(l.nimi().contains(lintu)) {
                l.havaitse();
                return true;
            }
        }
        
        return false;        
    }
    
    public Lintu haeLintu(String lintu) {
        
        for(Lintu l : this.lista) {
            
            if(l.nimi().toLowerCase().matches(lintu.toLowerCase())) {
                return l;
            }
        }
        
        return null;
    }
    
    @Override
    public String toString() {
        String ret = ""; 
        
        for(Lintu l : this.lista) {
            ret += String.format("%s\n", l);
        }
        
        return ret;
    }
    
}
