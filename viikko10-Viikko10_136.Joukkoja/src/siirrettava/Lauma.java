/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siirrettava;
import java.util.ArrayList;
/**
 *
 * @author jecode
 */
public class Lauma implements Siirrettava {
    
    private ArrayList<Siirrettava> herd = new ArrayList<Siirrettava>();

    
    public void lisaaLaumaan(Siirrettava otus) {
        herd.add(otus);
    }
    
    @Override
    public void siirra(int dx, int dy) {
        for(Siirrettava o : herd) {
            o.siirra(dx, dy);
        }
    }

    @Override
    public String toString() {
        String line = "";
        for(Siirrettava o : herd) {
            line += o + "\n";
        }
        
        return line;
    }
}
