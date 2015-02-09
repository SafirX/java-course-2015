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
public class Tekstikayttoliittyma {
    
    private final Scanner s;
    private Sanakirja book;
    
    public Tekstikayttoliittyma(Scanner s, Sanakirja b) {
        this.s = s;
        this.book = b;
    }
    
    public void kaynnista() {
       String komento;
       do {
           komento = menu();
           
           if( komento.equalsIgnoreCase("lisaa") ) lisaa();
           else if( komento.equalsIgnoreCase("kaanna") ) kaanna();
           
       } while(!komento.equalsIgnoreCase("lopeta"));
       
        System.out.println("Hei hei!");
    }
    
    private String menu() {
        System.out.println("Komennot:");
        System.out.println("   lisaa - lisää sanaparin sanakirjaan");
        System.out.println("   kaanna - kysyy sanan ja tuostaa sen käännöksen");
        System.out.println("   lopeta - poistuu käyttöliittymästä");
        System.out.println("");
        System.out.println("");
        System.out.print("Komento: ");
        return s.nextLine();
    }
    
    private void lisaa() {
        String fin, eng;
        System.out.print("Suomeksi: ");
        fin = s.nextLine();
        System.out.print("Käännös: ");
        eng = s.nextLine();
        System.out.println("");
        book.lisaa(fin, eng);
    }
    
    private void kaanna() {
        String key;
        System.out.print("Anna sana: ");
        key = s.nextLine();
        
        System.out.printf("Käännös: %s", book.kaanna(key));
        System.out.println("");
    }
    
}
