
import java.util.Scanner;

public class Summaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä kaksi lukua käyttäjältä!
        System.out.println("Anna ensimmäinen luku:");
        int a = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Anna toinen luku:");
        int b = Integer.parseInt(lukija.nextLine());
        
        System.out.println("\nLukujen summa: " + (a+b));
    }
}
