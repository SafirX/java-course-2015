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
public class Lukija {
    private Scanner s;
    
    public Lukija () {
        s = new Scanner(System.in);
    }
    
    public String lueMerkkijono() {
        return s.nextLine();
    }
    
    public int lueKokonaisluku() {
        return Integer.parseInt(s.nextLine());
    }
    
}
