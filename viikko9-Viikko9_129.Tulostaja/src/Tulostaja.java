/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author jecode
 */
public class Tulostaja {
    
    private File tiedosto;
    private Scanner scan;
    
    public Tulostaja(String tiedosto) throws Exception {
        
       this.tiedosto = new File(tiedosto);
    }
    
    public void tulostaRivitJoilla(String sana) throws Exception {
        scan = new Scanner(tiedosto);
        
        String line;
        while(scan.hasNextLine()) {
            if(!sana.isEmpty()) {
                line = scan.nextLine();
                if(line.contains(sana)) System.out.println(line);
            } else {
                System.out.println(scan.nextLine());
            }
        }
        
        
    }
    
}
