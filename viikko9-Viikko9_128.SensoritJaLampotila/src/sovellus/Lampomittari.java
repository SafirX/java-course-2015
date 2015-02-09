/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.*;

/**
 *
 * @author jecode
 */
public class Lampomittari implements Sensori {

    private boolean status = false;
    
    @Override
    public boolean onPaalla() {
        return status;
    }

    @Override
    public void paalle() {
        status = true;
    }

    @Override
    public void poisPaalta() {
        status = false;
    }

    @Override
    public int mittaa() {
        if(!status) throw new IllegalStateException();
        
        Random rnd = new Random();
        
        return rnd.nextInt(60) - 30;
                
    }
    
}
