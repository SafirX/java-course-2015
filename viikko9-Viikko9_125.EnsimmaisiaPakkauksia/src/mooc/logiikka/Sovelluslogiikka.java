/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logiikka;

import mooc.ui.Kayttoliittyma;

/**
 *
 * @author jecode
 */
public class Sovelluslogiikka {

    private Kayttoliittyma ui;
    
    public Sovelluslogiikka(Kayttoliittyma ui) {
        this.ui = ui;
    }
    
    public void suorita(int montaKertaa) {
        
        for(int i = 0; i < montaKertaa; i++) {
            System.out.println("Sovelluslogiikka toimii");
            ui.paivita();
        }
    }
    
    
}
