/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiedosto;

import java.io.File;
import java.util.Scanner;
/**
 *
 * @author jecode
 */
public class Analyysi {
    
    private File tiedosto;
    private Scanner reader;

    public Analyysi(File tiedosto) {
        try {
            this.tiedosto = tiedosto;
        } catch(Exception e) {
            System.out.println("Tiedoston avaus epäonnistui!");
        }
    }
    
    public int rivimaara() {
        avaaTiedosto();
        
        int rows = 0;
        while(reader.hasNextLine()) {
            rows++;
            reader.nextLine();
        }
        
        return rows;
    }
    
    public int merkkeja() {
        avaaTiedosto();
        
        int chars = 0;
        while(reader.hasNextLine()) {
            chars += reader.nextLine().length() + 1;
        }
        
        return chars;
    }
    
    private boolean avaaTiedosto() {
        try {
            this.reader = new Scanner(tiedosto);
            return true;
        } catch(Exception e) {
            System.out.println("Tiedoston avaus epäonnistui");
            return false;
        }
    }
    
}
