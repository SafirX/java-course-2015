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
public class Velkakirja {

    private HashMap<String,Double> velat;
    
    public Velkakirja() {
        velat = new HashMap<String,Double>();
    }
    
    public void asetaLaina(String who, double amount) {
        velat.put(who, amount);
    }
    
    public double paljonkoVelkaa(String who) {
        if(velat.containsKey(who))
            return velat.get(who);
        
        return 0;
    }
   
}
