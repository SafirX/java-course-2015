/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luola;
import java.util.*;
/**
 *
 * @author jecode
 */
public class Luola {
    
    private final Scanner reader = new Scanner(System.in);
 
    private final Pelaaja pelaaja;
    private final ArrayList<Hirvio> hirviot = new ArrayList<Hirvio>();
    
    private final int leveys;
    private final int korkeus;
    private int siirtoja;
    
    private final boolean liikkuuko;
    
    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirviotliikkuvat) {
        int x, y;
        Random arpoja = new Random();
        Coords c;
        HashSet<Coords> lisatyt = new HashSet<Coords>();
        
        this.pelaaja = new Pelaaja(0,0,leveys,korkeus);
        
        // Arvotaan hirviöt
        for(int i = 0; i < hirvioita; i++) {
            do {
                x = 1+arpoja.nextInt(leveys-1);
                y = 1+arpoja.nextInt(korkeus-1);
                c = new Coords(x,y);
            } while(lisatyt.contains(c));
            
            this.hirviot.add(new Hirvio(c));
        }
        
        // Kentän koko
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.siirtoja = siirtoja;
        this.liikkuuko = hirviotliikkuvat;
        
    }
    
    public void run() {
        
        do {
            tulostaSiirrot();
            System.out.println("");
            tulostaSijainnit();
            System.out.println("");
            tulostaKentta();
            System.out.println("");
            odotakomentoa();
        } while( this.siirtoja > 0 && this.hirviot.size() > 0);
        
        if(this.siirtoja == 0 && this.hirviot.size() > 0) {
            System.out.println("HÄVISIT");
        }
        if(this.siirtoja > 0 && this.hirviot.isEmpty()) {
            System.out.println("VOITIT");
        }
        
    }
    
    private void tulostaSiirrot() {
        System.out.println(this.siirtoja);
    }
    
    private void odotakomentoa() {
        String cmd = reader.nextLine();
        
        kasittelekomento(cmd);
        
    }
    
    private void kasittelekomento(String cmd) {
        this.siirtoja--;
        
        for( int i = 0; i < cmd.length(); i++ ) {
            this.pelaaja.liiku(cmd.charAt(i));
            
            tarkistaHirviot(this.pelaaja.sijainti());
        }
        
        liikutaHirviot();
    }
    
    private void tarkistaHirviot(Coords pos) {
        
        List<Hirvio> poista = new ArrayList<Hirvio>();
        
        for(Hirvio h : hirviot) {
            if(h.sijainti().equals(pos)) poista.add(h);
        }
        
        if(poista.size()> 0) {
            for(Hirvio h : poista) hirviot.remove(h);
        }
    }
    
    private boolean liikutaHirviot() {
        if(!this.liikkuuko) return false;
        
        int x, y;
        Random arpoja = new Random();
        Coords c;
        boolean cont = false;
        
        // Arvotaan hirviöt
        for(Hirvio h : hirviot) {
            cont = false;
            x = arpoja.nextInt(this.leveys-1);
            y = arpoja.nextInt(this.korkeus-1);
            c = new Coords(x,y);
            
            for(Hirvio t: hirviot) {
                if(t.sijainti().equals(c)) {
                    cont =true;
                    break;
                }
            }
            
            if(cont) continue;
            
            h.asetasijainti(c);
        }
        
        return true;
    }
    
    private void tulostaSijainnit() {
        System.out.println("@ "+this.pelaaja.sijainti());
        
        for(Hirvio h : this.hirviot) {
            System.out.println("h " + h.sijainti());
        }
        
    }
    
    private void tulostaKentta() {
        
        for(int y = 0; y < korkeus; y++) {
            for(int x = 0; x < leveys; x++) {
                System.out.printf("%s",haePiste(new Coords(x,y)));
            }
            System.out.println("");
        }
    }
    
    private String haePiste(Coords c) {
        if(this.pelaaja.sijainti().equals(c)) return "@";
        
        for(Hirvio h : this.hirviot) {
            if(h.sijainti().equals(c)) return "h";
        }
        
        return ".";
    }
    
    
}
