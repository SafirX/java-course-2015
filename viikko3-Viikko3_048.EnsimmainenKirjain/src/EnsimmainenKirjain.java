import java.util.Scanner;

public class EnsimmainenKirjain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        
        System.out.printf("Ensimmäinen kirjain: %c", ensimmainenKirjain(nimi));
        
        
    }
    
    
    public static char ensimmainenKirjain(String merkkijono) {
        return merkkijono.charAt(0);
    }
}
