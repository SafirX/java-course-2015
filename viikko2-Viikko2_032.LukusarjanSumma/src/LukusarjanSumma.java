
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mihin asti?");
        int summa = 0;
        int mihin = Integer.parseInt(lukija.nextLine());
        
        for( int i = 1; i <= mihin; i++ )
            summa += i;
        
        System.out.printf("Summa on %d", summa);

    }
}
