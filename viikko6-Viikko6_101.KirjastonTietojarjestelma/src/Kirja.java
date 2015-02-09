/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Kirja {
    
    private String nimi;
    private String julkaisija;
    private int year;
    
    
    public Kirja(String nimi, String pub, int year) {
        this.nimi = nimi;
        this.julkaisija = pub;
        this.year = year;
    }
    
    public String nimike() {
        return this.nimi;
    }
    
    public String julkaisija() {
        return this.julkaisija;
    }
    
    public int julkaisuvuosi() {
        return this.year;
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, %d", this.nimi, this.julkaisija, this.year);
    }
    
}
