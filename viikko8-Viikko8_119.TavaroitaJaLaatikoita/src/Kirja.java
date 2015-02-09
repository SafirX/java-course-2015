/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Kirja implements Talletettava {
    
    private final double weight;
    private final String author;
    private final String title;
    
    public Kirja(String author, String title, double weight) {
        this.weight = weight;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", author, title);
    }
    
    
    
    @Override
    public double paino() {
        return weight;
    }
    
}
