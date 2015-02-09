
import java.util.Scanner;

public class IkienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.println("Kerro nimi: ");
        String eka = lukija.nextLine();
        
        System.out.println("Kerro ikä: ");
        int a = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Kerro nimi: ");
        String toka = lukija.nextLine();
        
        System.out.println("Kerro ikä: ");
        int b = Integer.parseInt(lukija.nextLine());
        
        System.out.printf("%s ja %s ovat yhteensä %d vuotta vanhoja.", eka, toka, (a+b));
    }
}
