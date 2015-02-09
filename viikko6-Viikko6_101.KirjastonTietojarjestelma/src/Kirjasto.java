/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author jecode
 */
public class Kirjasto {
    
    private ArrayList<Kirja> books;
    
    public Kirjasto() {
        books = new ArrayList<Kirja>();
    }
    
    
    public void lisaaKirja(Kirja k) {
        if( !this.books.contains(k) ) this.books.add(k);
    }
    
    public void tulostaKirjat() {
        
        for( Kirja k : this.books ) {
            System.out.println(k);
        }
        
    }
    
    public ArrayList<Kirja> haeKirjaNimikkeella(String nimike) {
        ArrayList<Kirja> ret = new ArrayList<Kirja>();
        
        for( Kirja k : this.books ) {
            if(StringUtils.sisaltaa(k.nimike(), nimike)) ret.add(k);
        }
        
        return ret;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> ret = new ArrayList<Kirja>();
        
        for( Kirja k : this.books ) {
            if(StringUtils.sisaltaa(k.julkaisija(), julkaisija)) ret.add(k);
        }
        
        return ret;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> ret = new ArrayList<Kirja>();
        
        for( Kirja k : this.books ) {
            if(k.julkaisuvuosi()==julkaisuvuosi)ret.add(k);
        }
        
        return ret;
        
    }
    
}
