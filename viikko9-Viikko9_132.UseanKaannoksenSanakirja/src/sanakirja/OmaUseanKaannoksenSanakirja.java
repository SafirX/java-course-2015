/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.util.*;

/**
 *
 * @author jecode
 */
public class OmaUseanKaannoksenSanakirja implements UseanKaannoksenSanakirja {

    private HashMap<String,HashSet<String>> sanat = new HashMap<String,HashSet<String>>();
    
    @Override
    public void lisaa(String sana, String kaannos) {
        if(sanat.containsKey(sana)) {
            sanat.get(sana).add(kaannos);
        } else {
            sanat.put(sana,new HashSet<String>(Arrays.asList(kaannos)));
        }
    }

    @Override
    public Set<String> kaanna(String sana) {
        if(sanat.containsKey(sana)) {
            return sanat.get(sana);
        } else {
            return null;
        }
    }

    @Override
    public void poista(String sana) {
        if(sanat.containsKey(sana)) {
            sanat.remove(sana);
        }
    }
    
}
