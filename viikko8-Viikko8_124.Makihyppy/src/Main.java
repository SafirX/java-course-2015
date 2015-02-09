import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen 
        // on erittäin hyödyllistä.
        System.out.println("Kumpulan mäkiviikot\n");
        
        // Aloita kisa
        Kisa kisa = new Kisa(scan);
        
        // Luetaan kisaajat
        kisa.lueHyppaajat();
        
        // Aloitetaan hypyt
        kisa.aloita();
        
        // Katsotaan tulokset
        kisa.tulokset();
        
        
    }
}
