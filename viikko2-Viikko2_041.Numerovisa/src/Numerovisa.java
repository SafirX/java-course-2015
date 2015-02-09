
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();
        int luku;
        int arvauksia = 0;
        
        while(true) {
            System.out.print("Arvaa luku: ");
            luku = Integer.parseInt(lukija.nextLine());
            
            // Jos luku mätsää
            if( luku == arvottuLuku ) break;
            
            // Meni yksi arvaus
            arvauksia++;
            
            // Tarkisteaan tulos
            if( luku < arvottuLuku )
                System.out.printf("Luku on suurempi, tehtyjä arvauksia %d\n", arvauksia);
            else
                System.out.printf("Luku on pienempi, tehtyjä arvauksia %d\n", arvauksia);
            
        }
        
        System.out.println("Onneksi olkoon, oikein arvattu!");
    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}
