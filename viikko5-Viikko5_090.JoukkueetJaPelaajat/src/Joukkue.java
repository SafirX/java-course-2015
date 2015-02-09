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
public class Joukkue {
    
    private String nimi;
    private ArrayList<Pelaaja> jasenet = new ArrayList<Pelaaja>();
    private int max = 10;
    
    public Joukkue(String nimi) {
        this.nimi = nimi;
    }
    
    public String haeNimi() {
        return this.nimi;
    }
    
    public void asetaMaksimikoko(int maksimikoko) {
        this.max = maksimikoko;
    }
    
    public void lisaaPelaaja(Pelaaja p) {
        if(this.jasenet.size() < this.max) {
            if( !this.jasenet.contains(p) )
                this.jasenet.add(p);
        }
    }
    
    public int koko() {
        return this.jasenet.size();
    }
    
    public int maalit () {
        int maalit = 0;
        for( Pelaaja p : jasenet) {
            maalit += p.maalit();
        }
        
        return maalit;
    }
    
    public void tulostaPelaajat() {
        for(Pelaaja p : jasenet) {
            System.out.println(p.toString());
        }
    }
    
    
    public String nimi() {
        return this.nimi;
    }
    
}
