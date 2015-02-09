
import java.util.Scanner;

public class PotenssienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        double tulos = 0;
        
        for(int i = 0; i <= luku; i++) {
            tulos += Math.pow(2,i);
        }
        
        System.out.printf("%d", (int)tulos);
    }
}
