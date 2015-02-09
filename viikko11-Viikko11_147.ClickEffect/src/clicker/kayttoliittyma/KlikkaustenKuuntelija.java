/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author jecode
 */
public class KlikkaustenKuuntelija implements ActionListener {

    private final Laskuri laskuri;
    private final JLabel label;

    public KlikkaustenKuuntelija(Laskuri laskin, JLabel label) {
        this.laskuri = laskin;
        this.label = label;  
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        this.laskuri.kasvata();
        this.label.setText(this.laskuri.annaArvo()+"");
    }
    
    
}
