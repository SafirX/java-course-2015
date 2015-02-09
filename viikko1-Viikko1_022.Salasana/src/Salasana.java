
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!
        boolean started = false;
        do {
            if(started) {
                System.out.println("Väärin!");
            } else started = !started;
            
            System.out.println("Anna salasana: ");
        } while( !salasana.matches(lukija.nextLine()));
        
        System.out.println("Oikein!");
        
        System.out.println("\nSalaisuus on: znvavbfgv grugl!");
                
    }
}
