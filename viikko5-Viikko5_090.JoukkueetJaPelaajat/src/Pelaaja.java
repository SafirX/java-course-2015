/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Pelaaja {
    
    private String nimi;
    private int maalit = 0;
    
    
    public Pelaaja(String nimi) {
        this.nimi = nimi;
    }
    
    public Pelaaja(String nimi, int maalit) {
        this.nimi = nimi;
        this.maalit = maalit;
    }
    
    public String haeNimi() {
        return this.nimi;
    }
    
    public int maalit() {
        return this.maalit;
    }
    
    @Override
    public String toString() {
        return String.format("%s, maaleja %d", this.nimi, this.maalit);
    }
    
}
