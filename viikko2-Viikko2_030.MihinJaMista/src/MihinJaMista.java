
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti? ");
        int mihin = Integer.parseInt(lukija.nextLine());
        System.out.println("Mistä lähtien? ");
        int mista = Integer.parseInt(lukija.nextLine());
        
        if( mista <= mihin ) {
            for(int i = mista; i <= mihin; i++ )
                System.out.println(i);
        }
    }
}
