
import java.util.Scanner;


public class UseammanLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int luku;
        
        System.out.print("Anna lukuja, nolla lopettaa: \n");
        
        do {
            luku = Integer.parseInt(lukija.nextLine());
            
            if( luku != 0 ) {
                summa += luku;
                System.out.printf("Summa nyt: %d\n", summa);
            }
            
            
        } while( luku != 0 );
        
        System.out.println("Summa lopussa: " + summa);
    }
}
