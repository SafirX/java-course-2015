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
public class Muuntaja {
    
    ArrayList<Muunnos> lista;
    
    public Muuntaja() {
        lista = new ArrayList<Muunnos>();
    }
    
    public void lisaaMuunnos(Muunnos m) {
        if(!lista.contains(m))lista.add(m);
    }
    
    public String muunna(String s) {
        
        for(Muunnos m : lista) {
            s = m.muunna(s);
        }
        return s;
    }
    
}
