
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String cmd;
        
        Ohjain.kaynnista();

        while(true) {
            System.out.println("komento (sammuta, vasen, oikea, liiku, liikuMonta, ratkaise): ");
            cmd = lukija.nextLine();
            
            if( cmd.matches("sammuta") ) break;
            
            if( cmd.matches("vasen") ) Ohjain.vasen();
            
            if( cmd.matches("oikea") ) Ohjain.oikea();
            
            if( cmd.matches("liiku") ) Ohjain.liiku();
            
            if( cmd.matches("liikuMonta") ) {
                System.out.println("Kuinka monta askelta: ");
                Ohjain.liikuMonta(Integer.parseInt(lukija.nextLine()));
            }
            
            if( cmd.matches("ratkaise") ) {
                int robX = Ohjain.robottiX();
                int robY = Ohjain.robottiY();
                
                int boxX = Ohjain.laatikkoX();
                int boxY = Ohjain.laatikkoY();
                
                int goalX = Ohjain.tavoiteX();
                int goalY = Ohjain.tavoiteY();
                
                // Jos laatikko ylempänä kuin robotti, turn left
                if(boxY > robY) {
                    Ohjain.vasen();
                    Ohjain.liikuMonta(boxY-robY);
                    Ohjain.oikea();
                    Ohjain.liikuMonta(goalX-robX-1);
                    Ohjain.vasen();
                    Ohjain.liiku();
                    Ohjain.oikea();
                    Ohjain.liiku();
                    Ohjain.oikea();
                    robY = Ohjain.robottiY();
                    Ohjain.liikuMonta(robY-goalY-1);
                } else {
                    Ohjain.liikuMonta(goalX-robX-1);
                }
            }
        }

        Ohjain.sammuta();
    }
}
