/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilosto;

/**
 *
 * @author jecode
 */
public class Henkilo {

    private final String nimi;
    private final Koulutus koulutus;
    
    public Henkilo(String nimi, Koulutus k) {
        this.nimi = nimi;
        this.koulutus = k;
    }
    
    public Koulutus getKoulutus() {
        return this.koulutus;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.nimi, this.koulutus);
    }
    
    
    
    
    
}
