/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.sovelluslogiikka;

/**
 *
 * @author jecode
 */
public class OmaLaskuri implements Laskuri {
    
    private int luku;

    public OmaLaskuri() {
        this.luku = 0;
    }
    
    @Override
    public int annaArvo() {
        return luku;
    }
    
    @Override
    public void kasvata() {
        this.luku++;
    }
    
}
