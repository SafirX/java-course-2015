import java.util.Scanner;

public class EnsimmaisetKirjaimet {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        
        if( nimi.length() >= 3 ) {
            for(int i = 0; i < 3; i++) {
                System.out.printf("%d. kirjain: %c", (i+1), nimi.charAt(i));
            }
        }
    }
}
