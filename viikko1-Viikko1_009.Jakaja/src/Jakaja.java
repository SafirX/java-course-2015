
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä kaksi lukua käyttäjältä!
        System.out.println("Anna ensimmäinen luku:");
        int a = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Anna toinen luku:");
        int b = Integer.parseInt(lukija.nextLine());
        
        double tulos = (double)a / b;
        
        System.out.printf("\nJakolasku: %d / %d = %f", a, b, tulos);
    }
}
