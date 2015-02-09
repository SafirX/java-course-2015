/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanatutkimus;

import java.io.File;
import java.util.*;
import java.lang.StringBuilder;

/**
 *
 * @author jecode
 */
public class Sanatutkimus {
    
    private File tiedosto;
    private Scanner reader;

    public Sanatutkimus(File tiedosto) {
        this.tiedosto = tiedosto;
    }
    
    public int sanojenMaara() {
        avaa();
        
        int sanoja = 0;
        while(reader.hasNextLine()) {
            reader.nextLine();
            sanoja++;
        }
        
        return sanoja;
    }
    
    public List<String> kirjaimenZSisaltavatSanat() {
        ArrayList<String> sanat = new ArrayList<String>();
        avaa();
        
        String line;
        
        while(reader.hasNextLine()) {
            line = reader.nextLine();
            
            if(line.toLowerCase().contains("z")) sanat.add(line);
        }
        
        return sanat;
    }
    
    public List<String> kirjaimeenLPaattyvatSanat() {
        ArrayList<String> sanat = new ArrayList<String>();
        avaa();
        
        String line;
        
        while(reader.hasNextLine()) {
            line = reader.nextLine();
            
            if(line.toLowerCase().endsWith("l")) sanat.add(line);
        }
        
        return sanat;
    }
    
    public List<String> palindromit() {
        ArrayList<String> sanat = new ArrayList<String>();
        avaa();
        
        String line;
        StringBuilder sb = new StringBuilder();
        
        while(reader.hasNextLine()) {
            line = reader.nextLine();
            sb = new StringBuilder(line);
            sb.reverse();
            if(line.equalsIgnoreCase(sb.toString())) sanat.add(line);
        }
        
        return sanat;
    }
    
    public List<String> kaikkiVokaalitSisaltavatSanat() {
        ArrayList<String> sanat = new ArrayList<String>();
        avaa();
        
        String l;

        
        while(reader.hasNextLine()) {
            l = reader.nextLine();

            if(l.contains("a") && 
               l.contains("e") && 
               l.contains("i") &&
               l.contains("o") && 
               l.contains("u") && 
               l.contains("y") &&
               l.contains("ä") && 
               l.contains("ö")) sanat.add(l);
        }
        
        return sanat;
    }
    
    
    
    
    
    private boolean avaa() {
        try {
            reader = new Scanner(tiedosto);
            return true;
        } catch( Exception e ) {
            System.out.println("Tiedoston avaus epäonnistui!");
            return false;
        }
    }
    
}
