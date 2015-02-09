/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Laskuri {
    
    int arvo = 0;
    boolean check = false;
    
    public Laskuri( int alkuarvo, boolean tarkistus ) {
        this.arvo = alkuarvo;
        this.check = tarkistus;   
    }
    
    public Laskuri( int alkuarvo ) {
        this.arvo = alkuarvo;
    }
    
    public Laskuri( boolean tarkistus ) {
        this.check = tarkistus;
    }
    
    public Laskuri() {
        
    }
    
    public int arvo() {
        return this.arvo;
    }
    
    public void lisaa() {
        this.arvo++;
    }
    
    public void vahenna() {
        if( this.check ) {
            if( this.arvo > 0 )
                this.arvo--;
            else
                this.arvo = 0;
        } else {
            this.arvo--;
        }              
    }
    
    public void lisaa( int lisays) {
        if(lisays >= 0) this.arvo += lisays;
    }
    
    public void vahenna(int vahennys) {
        if(vahennys>=0) {
            if(this.check) {
                if((this.arvo - vahennys) >= 0) {
                    this.arvo -= vahennys;
                } else {
                    this.arvo = 0;
                }
            }else {
                this.arvo -= vahennys;
            }
        }
    }
    
    
}
