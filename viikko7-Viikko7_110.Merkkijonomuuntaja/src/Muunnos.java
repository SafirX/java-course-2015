/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Muunnos {
    
    private char a;
    private char b;
    
    public Muunnos(char muunnettava, char muunnettu) {
        this.a = muunnettava;
        this.b = muunnettu;
    }
    
    public String muunna(String merkkijono) {
        return merkkijono.replace(a, b);
    }
}
