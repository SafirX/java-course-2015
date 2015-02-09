/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author jecode
 */
public class Laskin {
    
    private final Lukija lukija;
    
    private int laskut = 0;
    
    public Laskin() {
        lukija = new Lukija();
    }
    
    public void kaynnista() {
        while(true) {
            System.out.println("komento: ");
            String komento = lukija.lueMerkkijono();
            
            if(komento.equalsIgnoreCase("lopetus")) break;
            
            if(komento.equalsIgnoreCase("summa")) summa();
            else if(komento.equalsIgnoreCase("erotus")) erotus();
            else if(komento.equalsIgnoreCase("tulo")) tulo();
        }
        
        statistiikka();
    }
    
    private void summa() {
        laskut++;
        int[] l = lueluvut();
        System.out.printf("Lukujen summa %d", (l[0]+l[1]));
    }
    
    private void erotus() {
        laskut++;
        int[] l = lueluvut();
        System.out.printf("Lukujen erotus %d", (l[0]-l[1]));
    }
    
    private void tulo() {
        laskut++;
        int[] l = lueluvut();
        System.out.printf("Lukujen tulo %d", (l[0]*l[1]));
    }
    
    private void statistiikka() {
        System.out.printf("Laskuja laskettiin %d", laskut);
    }
    
    private int[] lueluvut() {
        int[] l = new int[2];
        
        System.out.printf("Luku 1: ");
        l[0] = lukija.lueKokonaisluku();
        System.out.printf("Luku 2: ");
        l[1] = lukija.lueKokonaisluku();
        
        return l;
    }
}
