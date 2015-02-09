/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Ostos {
    
    private final String nimi;
    private final int yksikkohinta;
    private int maara;

    public Ostos(String nimi, int maara, int yksikkohinta) {
        this.nimi = nimi;
        this.yksikkohinta = yksikkohinta;
        this.maara = maara;
    }
    
    public int hinta() {
        return maara * yksikkohinta;
    }
    
    public void kasvataMaaraa() {
        maara++;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", nimi, maara);
    }
    
    
    
    
}
