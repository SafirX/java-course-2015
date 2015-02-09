/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;
import java.util.*;

/**
 *
 * @author jecode
 */
public class Lehma implements Eleleva, Lypsava {
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
  
    private final String nimi;
    private double utareet;
    private double maitoa = 0;
    
    public Lehma() {
        this.nimi = NIMIA[new Random().nextInt(NIMIA.length)];
        this.alustaUtareet();
        
    }
    public Lehma(String nimi) {
        this.nimi = nimi;
        this.alustaUtareet();
    }
    
    private void alustaUtareet() {
        this.utareet = 15 + new Random().nextInt(26);
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public double getTilavuus() {
        return this.utareet;
    }
    
    public double getMaara() {
        return this.maitoa;
    }
    
    @Override
    public void eleleTunti() {
        this.maitoa += 0.7 + ((double)(new Random().nextInt(13))/10);
        if(this.maitoa > this.utareet) this.maitoa = this.utareet;
    }

    @Override
    public double lypsa() {
        double ota = this.maitoa;
        this.maitoa = 0.0;
        return ota;
    }

    @Override
    public String toString() {
        return String.format("%s %.1f/%.1f", this.nimi, Math.ceil(this.maitoa), Math.ceil(this.utareet));
    }
    
    
    
}
