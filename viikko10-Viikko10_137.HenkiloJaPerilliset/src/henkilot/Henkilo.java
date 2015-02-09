/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilot;

/**
 *
 * @author jecode
 */
public class Henkilo {
    private final String nimi;
    private final String osoite;

    public Henkilo(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        return String.format("%s\n  %s",this.nimi, this.osoite);
    }
    
    
}
