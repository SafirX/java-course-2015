
import java.util.Scanner;

public class SuurempiLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku: ");
        int a = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int b = Integer.parseInt(lukija.nextLine());
        
        System.out.printf("\nLuvuista suurempi: %d", (a > b ? a : b));
        
    }
}
