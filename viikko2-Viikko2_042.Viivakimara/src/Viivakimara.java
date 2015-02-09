
import robotti.Ohjain;

public class Viivakimara {

    public static void main(String[] args) {
        Ohjain.kaynnista();
        Ohjain.asetaOdotusaika(10);
        viivakimara(12);

        Ohjain.sammuta();
    }

    public static void liikuMonta(int count) {
        for(int i = 0; i < count; i++) Ohjain.liiku();
    }
    
    public static void piirraNelio(int sivu) {
        for(int i = 0; i < 4; i++) {
            liikuMonta(sivu);
            Ohjain.oikea();
        }
    }
    
    public static void sisakkaisetNeliot(int count) {
        rajatutSisakkaisetNeliot(count, 1);
        
    }
    
    public static void rajatutSisakkaisetNeliot( int suurin, int pienin ) {
        for(int i = pienin; i <= suurin; i++) {
            piirraNelio(i);
        }
    }
    
    public static void viivakimara(int koko) {
        int i;
        
        for(i = 0; i < koko; i++) {
            Ohjain.liiku();
            Ohjain.oikea();
            Ohjain.liiku();
            Ohjain.vasen();
        }
        
        Ohjain.vasen();
        
        for(i = 0; i < koko; i++) {
            Ohjain.vasen();
            Ohjain.liiku();
            Ohjain.oikea();
            Ohjain.liiku();
        }
        
        Ohjain.oikea();
        liikuMonta(koko);
        Ohjain.oikea();
        
        for(i = 0; i < koko; i++ ) {
            Ohjain.oikea();
            Ohjain.liiku();
            Ohjain.vasen();
            Ohjain.liiku();
        }
        
        Ohjain.vasen();
        
        for(i = 0; i < koko; i++ ) {
            Ohjain.liiku();
            Ohjain.vasen();
            Ohjain.liiku();
            Ohjain.oikea();
        }
        
        
        for(i=0; i < 4; i++) {
            Ohjain.oikea();
            liikuMonta(koko);
        }
    }
}
