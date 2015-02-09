/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laatikot;

import java.util.*;

/**
 *
 * @author jecode
 */
public class HukkaavaLaatikko extends Laatikko {

    private ArrayList<Tavara> tavarat = new ArrayList<Tavara>();
    
    public HukkaavaLaatikko() {
    }

    @Override
    public void lisaa(Tavara tavara) {
        tavarat.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
    
    
}
