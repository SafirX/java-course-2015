
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        
        System.out.println("Anna salasana: ");
        String ssana = lukija.nextLine();
        
        if( (tunnus.matches("aleksi") && ssana.matches("tappara")) || (tunnus.matches("elina") && ssana.matches("kissa")))
            System.out.println("Olet kirjautunut järjestelmään");
        else
            System.out.println("Virheellinen tunnus tai salasana!");
    }
}
