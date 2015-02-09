/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Tuote {
    
    private String name;
    private double price;
    private int amount;
    
    public Tuote(String name, double price, int amount) {
        
        this.name = name;
        this.price = price;
        this.amount = amount;
        
    }
    
    public void tulostaTuote() {
        System.out.printf("%s, hinta %f, %d kpl", this.name, this.price, this.amount);
    }
    
}
