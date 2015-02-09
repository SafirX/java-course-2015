
import java.util.Scanner;

public class PositiivinenLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        System.out.printf("%s", (luku <1 ? "Luku ei ole positiivinen." : "Luku on positiivinen."));
    }
}
