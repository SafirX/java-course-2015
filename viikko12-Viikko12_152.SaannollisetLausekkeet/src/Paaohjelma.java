
import java.util.Scanner;


public class Paaohjelma {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Anna merkkijono: ");
        String jono = reader.nextLine();
        
        if(kellonaika(jono)) {
            System.out.println("Muoto on oikea.");
        } else {
            System.out.println("Muoto ei ole oikea.");
        }
        
    }
    
    public static boolean onViikonpaiva(String merkkijono) {
        
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }
    
    public static boolean kaikkiVokaaleja(String merkkijono) {
        return merkkijono.matches("[aeiouyäö]+");
    }
    
    public static boolean kellonaika(String merkkijono) {
        return merkkijono.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}
