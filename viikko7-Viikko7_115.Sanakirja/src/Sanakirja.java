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
public class Sanakirja {
    
    private HashMap<String,String> words;
    
    public Sanakirja() {
        words = new HashMap<String,String>();
    }
    
    public void lisaa(String fin, String eng) {
        words.put(fin, eng);
    }
    
    public String kaanna(String word) {
        return words.get(word);
    }
    
    public int sanojenLukumaara() {
        return words.size();
    }
    
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> lista = new ArrayList<String>();
        
        Iterator it = words.entrySet().iterator();
        while( it.hasNext() ) {
            Map.Entry row = (Map.Entry)it.next();
            lista.add(row.getKey() + " = " + row.getValue());
            it.remove();
        }
        
        return lista;
    }
}
