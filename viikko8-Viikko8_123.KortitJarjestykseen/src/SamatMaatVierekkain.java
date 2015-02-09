/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
/**
 *
 * @author jecode
 */
public class SamatMaatVierekkain implements Comparator<Kortti> {

    @Override
    public int compare(Kortti o1, Kortti o2) {
        return o1.getMaa() - o2.getMaa();
    }
    
    
    
}
