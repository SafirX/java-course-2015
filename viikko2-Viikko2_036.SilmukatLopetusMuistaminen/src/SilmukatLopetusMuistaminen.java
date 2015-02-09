
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // tee tähän projektiin tehtävät 36.1-36.5
        // kyseessä on oikeastaan yksi iso tehtävä jota koko ajan laajennetaan

        // voit myös lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. jo tehdyt osat kuitenkin kirjautuvat tehdyiksi
        Scanner lukija = new Scanner(System.in);
        
        
        int luku;
        int summa = 0;
        int lukuja = 0;
        int odds = 0;
        System.out.println("Syötä luvut:");
        do {
            luku = Integer.parseInt(lukija.nextLine());
            if(luku == -1) break;
            
            summa += luku;
            lukuja++;
            
            if(luku % 2 == 0) odds++;
            
        } while(true);
        
        System.out.printf("Kiitos ja näkemiin!");
        System.out.printf("\nSumma: %d", summa);
        System.out.printf("\nLukuja: %d", lukuja);
        System.out.printf("\nKeskiarvo: %f", ((double)summa / lukuja));
        System.out.printf("\nParillisia %d", odds);
        System.out.printf("\nParittomia %d", (lukuja-odds));
        
        
    }
}
