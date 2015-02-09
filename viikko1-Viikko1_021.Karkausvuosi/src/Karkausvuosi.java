
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna vuosi: ");
        int v = Integer.parseInt(lukija.nextLine());
        
        if( v % 4 == 0 && v % 100 != 0)
            System.out.println("Vuosi on karkausvuosi.");
        else {
            if( v % 100 == 0 && v % 400 == 0 )
                System.out.println("Vuosi on karkausvuosi.");
            else
                System.out.println("Vuosi ei ole karkausvuosi.");
        }
    }
}
