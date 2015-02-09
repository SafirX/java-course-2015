
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();
        
        int i;

        // ohjelmoi liikkeet tänne
        for(i = 0; i < 7; i++)
            Ohjain.oikealle();
        
        for(i = 0; i < 5; i++)
            Ohjain.ylos();
        
        for(i = 0; i < 7; i++)
            Ohjain.vasemmalle();
        
        for(i = 0; i < 5; i++)
            Ohjain.alas();
        
        for(i =0; i < 3; i++)
            Ohjain.ylos();
        
        for(i = 0; i < 3; i++)
            Ohjain.oikealle();
        
        for(i = 0; i < 2; i++)
            Ohjain.ylos();
        
        for(i = 0; i < 3; i++)
            Ohjain.vasemmalle();
        
        Ohjain.sammuta();
    }
}
