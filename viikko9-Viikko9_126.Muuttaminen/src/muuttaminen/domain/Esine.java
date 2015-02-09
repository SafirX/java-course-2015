/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muuttaminen.domain;

/**
 *
 * @author jecode
 */
public class Esine implements Tavara, Comparable<Esine> {

    private final String nimi;
    private final int tilavuus;

    public Esine(String nimi, int tilavuus) {
        this.nimi = nimi;
        this.tilavuus = tilavuus;
    }
    
    public String getNimi() {
        return this.nimi;
    }

    @Override
    public String toString() {
        return String.format("%s (%d dm^3)",this.nimi, this.tilavuus);
    }

    @Override
    public int compareTo(Esine o) {
        return this.tilavuus - o.getTilavuus();
    } 
    
    @Override
    public int getTilavuus() {
        return this.tilavuus;
    }
}
