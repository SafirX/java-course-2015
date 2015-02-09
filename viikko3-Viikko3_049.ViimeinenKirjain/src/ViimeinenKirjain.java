import java.util.Scanner;

public class ViimeinenKirjain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        
        System.out.printf("Viimeinen kirjain: %c", viimeinenKirjain(nimi));
        
        
    }
    
    
    public static char viimeinenKirjain(String merkkijono) {
        return merkkijono.charAt(merkkijono.length()-1);
    }
}
