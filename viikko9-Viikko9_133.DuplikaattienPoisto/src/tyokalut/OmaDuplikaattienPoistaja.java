/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyokalut;

import java.util.*;

/**
 *
 * @author jecode
 */
public class OmaDuplikaattienPoistaja implements DuplikaattienPoistaja {

    private HashSet<String> jonot = new HashSet<String>();
    private int dupes = 0;
    
    @Override
    public void lisaa(String merkkijono) {
        if(jonot.contains(merkkijono)) {
            dupes++;
        } else {
            jonot.add(merkkijono);
        }
    }

    @Override
    public int getHavaittujenDuplikaattienMaara() {
        return dupes;
    }

    @Override
    public Set<String> getUniikitMerkkijonot() {
        return jonot;
    }

    @Override
    public void tyhjenna() {
        jonot.clear();
        dupes = 0;
    }
    
}
