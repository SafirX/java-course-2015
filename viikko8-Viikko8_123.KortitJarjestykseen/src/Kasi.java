
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Kasi implements Comparable<Kasi>{
    
    private ArrayList<Kortti> cards = new ArrayList<Kortti>();

    public Kasi() {
    }
    
    public void lisaa(Kortti kortti) {
        cards.add(kortti);
    }
    
    public void jarjesta() {
        Collections.sort(cards);
    }
    
    public void jarjestaMaittain() {
        Collections.sort(cards, new SamatMaatVierekkainArvojarjestykseen());
    }
    
    public int arvo() {
        
        int arvo = 0;
        for(Kortti k : cards) arvo += k.getArvo();
        
        return arvo;
    }
    
    public void tulosta() {
        
        for(Kortti k : cards) {
            System.out.println(k);
        }
    }

    @Override
    public int compareTo(Kasi o) {
        return (arvo()-o.arvo());
    }
    
    
}
