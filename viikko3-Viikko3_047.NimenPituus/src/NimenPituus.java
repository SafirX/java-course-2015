
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna nimi: ");
        System.out.printf("Kirjainmäärä: %d", laskeKirjaimet(lukija.nextLine()));
    }
    
    // tee tänne metodi 
    public static int laskeKirjaimet(String merkkijono) {
        return merkkijono.length();
    }
    
}
