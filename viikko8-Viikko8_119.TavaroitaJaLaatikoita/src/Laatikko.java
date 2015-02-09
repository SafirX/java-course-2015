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
public class Laatikko implements Talletettava {
    private ArrayList<Talletettava> box;
    
    private final double maxPaino;

    public Laatikko(double maxPaino) {
        box = new ArrayList<Talletettava>();
        this.maxPaino = maxPaino;
    }
    
    public void lisaa(Talletettava tavara) {
        
        if(paino()+tavara.paino() <= maxPaino)
            box.add(tavara);
        
    }
    
    @Override
    public double paino() {
        
        double p = 0;
        
        for(Talletettava t : box) {
            p += t.paino();
        }
        
        return p;
    }

    @Override
    public String toString() {
        return String.format("Laatikko: %d esinettä, paino yhteensä %.2g kiloa", box.size(), paino());
    }
    
    
    
    
}
