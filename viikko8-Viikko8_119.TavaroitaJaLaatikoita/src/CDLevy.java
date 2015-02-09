/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class CDLevy implements Talletettava {
    
    private final String artist;
    private final String album;
    private final int year;
    private final double weight = 0.1;

    public CDLevy(String artist, String album, int year) {
        this.artist = artist;
        this.album = album;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s: %s (%d)", artist, album, year);
    }
    
    
    
    
    @Override
    public double paino() {
        return weight;
    }
    
}
