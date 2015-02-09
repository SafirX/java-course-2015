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
public class Lentopalvelu {
    
    private final Lentokentta kentta;
    private final Scanner s;
    
    public Lentopalvelu(Lentokentta kentta, Scanner s) {
        this.kentta = kentta;
        this.s = s;
        
        System.out.println("\n\nLentopalvelu");
        System.out.println("------------");
    }
    
    public void palvele() {
        
        String cmd;
        
        do {
            menu();
            System.out.printf("> ");
            cmd = s.nextLine();
            
            if( cmd.equals("1") ) showPlanes();
            else if( cmd.equals("2") ) showFlights();
            else if( cmd.equals("3") ) findPlane();
            
        } while( !cmd.equalsIgnoreCase("x"));
        
    }
    
    private void menu() {
        System.out.println("\nValitse toiminto:");
        System.out.println("[1] Tulosta lentokoneet");
        System.out.println("[2] Tulosta lennot");
        System.out.println("[3] Tulosta lentokoneen tiedot");
        System.out.println("[x] Lopeta");
    }
    
    
    private void showPlanes() {
        kentta.tulostaKoneet();
    }
    
    private void showFlights() {
        kentta.tulostaLennot();
    }
    
    private void findPlane() {
        System.out.printf("\nMikä kone: ");
        kentta.tulostaKone(s.nextLine().toUpperCase());
    }
    
    
    
}
