/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class YlhaaltaRajoitettuLaskuri {
    
    private int max;
    private int value = 0;
    
    public YlhaaltaRajoitettuLaskuri(int top) {
        this.max = top;
    }
    
    public YlhaaltaRajoitettuLaskuri(int top, int alku) {
        this.max = top;
        
        if( alku <= top) {
            this.value = alku;
        }
    }
    
    public void seuraava() {
        if((this.value+1) <= this.max) this.value++;
        else this.value = 0;
    }
    
    public void asetaArvo(int luku) {
        if( luku >= 0 && luku <= max ) this.value = luku;
    }
    
    public int arvo() {
        return this.value;
    }
    
    @Override
    public String toString() {
        // Code here
        return String.format("%02d",this.value);
    }
    
}
