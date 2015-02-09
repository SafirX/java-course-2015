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
public class Ostoskori {
    
    private Map<String, Ostos> kori;

    public Ostoskori() {
        kori = new HashMap<String, Ostos>();
    }
    
    public void lisaa(String tuote, int hinta) {
        
        if(kori.containsKey(tuote)) {
            kori.get(tuote).kasvataMaaraa();
        } else {
            kori.put(tuote, new Ostos(tuote, 1, hinta));
        }
        
    }
    
    public int hinta() {
        
        Collection<Ostos> tavarat = kori.values();
        int hinta = 0;
        for(Ostos o : tavarat) {
            hinta += o.hinta();
        }
        return hinta;
    }
    
    public void tulosta() {
        
        for(String s : kori.keySet()) {
            System.out.println(kori.get(s));
        }
        
    }
    
    
    
}
