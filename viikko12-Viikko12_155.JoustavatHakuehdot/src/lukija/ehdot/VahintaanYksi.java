/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lukija.ehdot;

/**
 *
 * @author jecode
 */
public class VahintaanYksi implements Ehto {

    private final Ehto[] ehdot;

    public VahintaanYksi(Ehto... ehdot) {
        this.ehdot = ehdot;
    }
    
    
    
    @Override
    public boolean toteutuu(String rivi) {
        
        for(int i = 0; i < ehdot.length; i++) {
            if(ehdot[i].toteutuu(rivi)) return true;
        }
        
        return false;
    }
    
}
