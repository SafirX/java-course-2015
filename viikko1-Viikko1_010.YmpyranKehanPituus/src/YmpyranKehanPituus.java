
import java.util.Scanner;

public class YmpyranKehanPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Anna ympyrän säde: ");
        
        double sade = Double.parseDouble(lukija.nextLine());
        
        System.out.printf("\nYmpyrän kehä: %f", (Math.PI * sade * 2));
    }
}
