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
public class Kisa {

    private ArrayList<Osallistuja> hyppaajat = new ArrayList<Osallistuja>();
    private Scanner scan;
    private int kierros = 0;
    private String cmd;
    
    public Kisa(Scanner scan) {
        this.scan = scan;
    }
    
    public void lueHyppaajat() {
        System.out.println("Syötä kilpailun osallistujat yksi kerrallaan, tyhjällä merkkijonolla siirtyy hyppyvaiheeseen.");
        
        do {
            System.out.printf("  Osallistujan nimi: ");
            cmd = scan.nextLine();
            if(!cmd.isEmpty()) hyppaajat.add(new Osallistuja(cmd));
        } while(!cmd.isEmpty());
        
        System.out.println("");
    }
    
    public void aloita() {
        System.out.println("Kilpailu alkaa!\n");
        
        do {
            System.out.printf("Kirjoita \"hyppaa\" niin hypätään, muuten lopetetaan: ");
            cmd = scan.nextLine();
            // Hypataan
            if(cmd.equals("hyppaa")) {
                kierros++;
                System.out.printf("%d. kierros\n\n", kierros);
                
                Collections.sort(hyppaajat);
                System.out.println("Hyppyjärjestys:");
                int i = 1;
                for(Osallistuja o : hyppaajat) {
                    System.out.printf("  %d. %s\n", i, o);
                    i++;
                }
                
                System.out.printf("\nKierroksen %d tulokset\n", kierros);
                for(Osallistuja o : hyppaajat) {
                    Hyppy h = o.hyppaa();
                }
                
                System.out.println("");
            }
        
        } while(cmd.equals("hyppaa"));
        
        System.out.printf("\nKiitos!\n");
    }
    
    public void tulokset() {
        System.out.printf("\nKilpailun lopputulokset:\n"
                + "Sija    Nimi\n");
        
        Collections.sort(hyppaajat);
        Collections.reverse(hyppaajat);
        
        int i = 1;
        for(Osallistuja o : hyppaajat) {
            System.out.printf("%d       %s\n          hyppyjen pituudet: %s\n",
                                i, o, o.hypyt());
            i++;
        }
    }
    
    
}
