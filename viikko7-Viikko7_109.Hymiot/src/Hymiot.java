
public class Hymiot {

    public static void main(String[] args) {
        // Testaa metodisi toimintaa ainakin seuraavilla kutsuilla
        tulostaHymioityna("Metodi");
        tulostaHymioityna("Hajautustaulu");
        tulostaHymioityna("Rajapinta");
    }
    
    private static void tulostaHymioityna(String s) {
        // Jos pariton, lisätään väli
        if( s.length() % 2 != 0 ) s += " ";
        
        int w = s.length() + 6;
        
        tulostaHymiot(w);
        System.out.printf(":) %s :)\n", s);
        tulostaHymiot(w);
    }
    
    private static void tulostaHymiot(int w) {
        
        for(int i = 0; i < (w/2); i++) {
            System.out.printf(":)");
        }
        System.out.printf("\n");;
        
    }
}
