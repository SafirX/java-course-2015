/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author jecode
 */
public class Vakiosensori implements Sensori {

    private final boolean status = true;
    private final int arvo;

    public Vakiosensori(int arvo) {
        this.arvo = arvo;
    }
      
    @Override
    public boolean onPaalla() {
        return status;
    }

    @Override
    public void paalle() {
        
    }

    @Override
    public void poisPaalta() {
        
    }

    @Override
    public int mittaa() {
        return arvo;
    }
    
}
