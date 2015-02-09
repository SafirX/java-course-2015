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
public class Opettaja extends Henkilo {

    private int palkka;
    
    public Opettaja(String nimi, String osoite, int palkka) {
        super(nimi, osoite);
        this.palkka = palkka;
    }

    @Override
    public String toString() {
        return String.format("%s\n  palkka %d euroa/kk", super.toString(), this.palkka);
    }
    
    
    
}
