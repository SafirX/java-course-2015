
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen: ");
        int eka = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Viimeinen: ");
        int toka = Integer.parseInt(lukija.nextLine());
        
        int summa = 0;
        
        System.out.printf("Eka: %d, toka: %d", eka, toka);
        
        while( eka <= toka ) {
            summa += eka;
            eka++;
        }
        
        System.out.printf("Summa on %d", summa);
    }
}
