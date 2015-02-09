/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Tavara {

    private final String nimi;
    private final int paino;
    
    public Tavara(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }
    
    public int getPaino() {
        return this.paino;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%d kg)", this.nimi, this.paino);
    }
}
