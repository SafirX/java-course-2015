
import java.util.Scanner;

public class Lampotiloja {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        double luku;
        
        // Toteuta lämpötilaohjelma tähän.
        while(true) {
            luku = Double.parseDouble(lukija.nextLine());
            
            if(luku >= -30 && luku <= 40 )
                Kuvaaja.lisaaNumero(luku);
            
        }

    }
}
