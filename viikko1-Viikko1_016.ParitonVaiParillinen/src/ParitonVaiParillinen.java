
import java.util.Scanner;

public class ParitonVaiParillinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        System.out.printf("Luku %d on %s.", luku, ((luku%2)==0?"parillinen":"pariton"));
        
    }
}
