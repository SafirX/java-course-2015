/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;
    }

    @Override
    public String toString() {
        return "Kortilla on rahaa "+this.saldo+" euroa";
    }
    
    public void syoEdullisesti() {
        if( this.saldo >= 2.5)
            this.saldo -= 2.5;
        
    }
    
    public void syoMaukkaasti() {
        // Code here
        if( this.saldo >= 4.3)
            this.saldo -= 4.3;
    }
    
    public void lataaRahaa(double amount) {
        // Code here
        if( amount > 0 ) {
            if( (this.saldo+amount) <= 150 )
                this.saldo += amount;
            else
                this.saldo = 150;
        }
    }
}