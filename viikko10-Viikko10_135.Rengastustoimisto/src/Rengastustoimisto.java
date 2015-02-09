/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author jecode
 */
public class Rengastustoimisto {

    private HashMap<Lintu,ArrayList<String>> linnut = new HashMap<Lintu,ArrayList<String>>();
    
    
    public void havaitse(Lintu lintu, String paikka) {
        
        if(linnut.containsKey(lintu)) {
            linnut.get(lintu).add(paikka);
        } else {
            linnut.put(lintu, new ArrayList<String>());
            if(!paikka.isEmpty())
                linnut.get(lintu).add(paikka);
        }
        
        
    }
    
    public void havainnot(Lintu lintu) {
        
        if(linnut.containsKey(lintu)) {
            
            ArrayList<String> havainnot = linnut.get(lintu);    
            System.out.printf("%s havaintoja: %d\n", lintu, havainnot.size());
            
            for(String s : havainnot) {
                System.out.println(s);
            }
        } else {
            System.out.printf("%s havaintoja: 0\n", lintu);
        }
    }
    
}
