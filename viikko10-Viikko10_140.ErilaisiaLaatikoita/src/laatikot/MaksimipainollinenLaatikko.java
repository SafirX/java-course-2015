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
public class MaksimipainollinenLaatikko extends Laatikko {

    private final int maksimipaino;
    
    private ArrayList<Tavara> tavarat = new ArrayList<Tavara>();
    
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
    }
    
    @Override
    public void lisaa(Tavara tavara) {
        
        int sum = 0;
        for(Tavara t : tavarat) sum += t.getPaino();
        
        if(tavara.getPaino() + sum <= maksimipaino)
            this.tavarat.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return tavarat.contains(tavara);
    }
    
}
