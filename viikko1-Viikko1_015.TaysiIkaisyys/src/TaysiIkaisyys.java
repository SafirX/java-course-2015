
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet? ");
        
        int ika = Integer.parseInt(lukija.nextLine());
        
        System.out.printf("%s", (ika >= 18 ? "Olet jo täysi-ikäinen!" : "Et ole vielä täysi-ikäinen!"));
    }
}
