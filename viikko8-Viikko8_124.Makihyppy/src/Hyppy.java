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
public class Hyppy {
    private final int pituus;
    private final ArrayList<Integer> pisteet =  new ArrayList<Integer>();
    private final Random arpa = new Random();
    
    public Hyppy() {
        this.pituus = arpa.nextInt(60) + 60;
        
        for(int i = 0; i < 5; i++) {
            pisteet.add(arpa.nextInt(10) + 10);
        }
        
        Collections.sort(pisteet);
    }
    
    public int pituus() {
        return this.pituus;
    }
    
    public int yhteispisteet() {
        return pituus() + tuomaripisteet();
    }
    
    public int tuomaripisteet() {
        
        return pisteet.get(1) + pisteet.get(2) + pisteet.get(3);
        
    }

    @Override
    public String toString() {
        return String.format("[%d, %d, %d, %d, %d]",
                             pisteet.get(0),
                             pisteet.get(1),
                             pisteet.get(2),
                             pisteet.get(3),
                             pisteet.get(4));
    }
    
    
    
    
}
