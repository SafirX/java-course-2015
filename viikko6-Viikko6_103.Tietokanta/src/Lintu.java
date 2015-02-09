/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Lintu {
    
    private String nimi;
    private String lat;
    
    int havainnot = 0;
    
    public Lintu(String nimi, String lat) {
        this.nimi = nimi;
        this.lat = lat;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    public String lat() {
        return this.lat;
    }
    
    public void havaitse() {
        this.havainnot++;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s): %d havaintoa", this.nimi, this.lat, this.havainnot);
    }
    
}
