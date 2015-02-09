/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jecode
 */
public class MuistavaSanakirja {

    private FileWriter writer;
    private Scanner reader;
    
    private ArrayList<String> words = new ArrayList<String>();

    
    private String sanat;

    public MuistavaSanakirja() {
    }
    
    public MuistavaSanakirja(String tiedosto) {
        this.sanat = tiedosto;
    }
    
    
    public boolean lataa() {
        
        try {
            reader = new Scanner(new File(this.sanat));

            while(reader.hasNextLine()) {
                words.add(reader.nextLine());
            }
        } catch(FileNotFoundException e) {
            return false;
        }
        
        return true;
    }
    
    public void lisaa(String sana, String kaannos) {
        words.add(sana+":"+kaannos);
    }
    
    public String kaanna(String sana) {
        
        String[] sanat;
        
        for(String s : words) {
            sanat = s.split(":");
            if(sanat[0].equalsIgnoreCase(sana)) return sanat[1];
            if(sanat[1].equalsIgnoreCase(sana)) return sanat[0];
        }
    
        return null;
    }
    
    public void poista(String sana) {
        int index = 0;
        
        for(String line : words) {
            if(line.toLowerCase().contains(sana)) break;
            index++;
        }
        
        words.remove(index);
    }
    
    public boolean tallenna() {
        
        try {
            writer = new FileWriter(this.sanat);
            
            ArrayList<String> lisatyt = new ArrayList<String>();
            String[] w;
            for(String line : words) {
                w = line.split(":");
                if(!lisatyt.contains(w[0]) && !lisatyt.contains(w[1])) {
                    writer.write(line+"\n");
                }
            }
            writer.close();
            
        } catch(IOException e) {
            
            
            return false;
        }
        
        
        return true;
    }
    
}
