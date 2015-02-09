
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int luettu;

        
        System.out.println("Anna ensimmäinen luku: ");
        summa += Integer.parseInt(lukija.nextLine());
        
        System.out.println("Anna toinen luku: ");
        summa += Integer.parseInt(lukija.nextLine());
        
        System.out.println("Anna kolmas luku: ");
        summa += Integer.parseInt(lukija.nextLine());

        System.out.println("Summa: " + summa);
    }
}
