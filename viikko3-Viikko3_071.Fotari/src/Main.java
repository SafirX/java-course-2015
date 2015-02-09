
import java.util.ArrayList;
import java.util.Scanner;
import kuva.Fotari;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner lukija = new Scanner(System.in);

        // käytössä ilta.jpg, puu.jpg ja kukka.jpg
        System.out.print("Mikä kuva avataan? ");
        String kuva = lukija.nextLine();

        Fotari.avaa(kuva);

        while (true) {
            System.out.print("komento (lopeta, vaalenna, tummenna, negatiivi, peilaa, sumenna)? ");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                break;
            }

            if (komento.equals("vaalenna")) {
                vaalenna();
            } // BEGIN SOLUTION
            else if (komento.equals("tummenna")) {
                tummenna();
            } else if (komento.equals("negatiivi")) {
                negatiivi();
            } else if (komento.equals("peilaa")) {
                peilaa();
            } else if (komento.equals("sumenna")) {
                System.out.print("Kuinka paljon? ");
                int arvo = Integer.parseInt(lukija.nextLine());
                sumenna(arvo);
            }
            // END SOLUTION
        }

        Fotari.sulje();
    }
    
    public static void tummenna() {
        for( int x = 0; x < Fotari.kuvanLeveys(); x++ ) {
            for( int y = 0; y < Fotari.kuvanKorkeus(); y++ ) {
                
                int r = max(0, Fotari.punainen(x, y) - 30);
                int g = max(0, Fotari.vihrea(x, y) - 30);
                int b = max(0, Fotari.sininen(x, y) - 30);
                
                Fotari.asetaVari(x, y, r, g, b);
            }
            
        }
    }
    
    public static void negatiivi() {
        for( int x = 0; x < Fotari.kuvanLeveys(); x++ ) {
            for( int y = 0; y < Fotari.kuvanKorkeus(); y++ ) {
                
                int r = 255 - Fotari.punainen(x, y);
                int g = 255 - Fotari.vihrea(x, y);
                int b = 255 - Fotari.sininen(x, y);
                
                Fotari.asetaVari(x, y, r, g, b);
            }
        }
    }
    
    public static void sumenna(int range) {
        int w = Fotari.kuvanLeveys();
        int h = Fotari.kuvanKorkeus();
        
        for( int x = 0; x < w; x++) {
            for( int y = 0; y < h; y++) {
                
                ArrayList<Integer> r = Fotari.punaiset(x, y, range);
                ArrayList<Integer> g = Fotari.vihreat(x, y, range);
                ArrayList<Integer> b = Fotari.siniset(x, y, range);
                
                Fotari.asetaVari(x, y, avg(r), avg(g), avg(b));
            }
        }
    }
    
    public static int avg(ArrayList<Integer> list) {
        int sum = 0;
        for(int i : list ) sum += i;
        
        return sum / list.size();
    }
    
    public static void peilaa() {
        int w = Fotari.kuvanLeveys();
        int h = Fotari.kuvanKorkeus();
        
        for( int x = 0; x < (w/2); x++) {
            for( int y = 0; y < h; y++) {
                int r = Fotari.punainen((w-x-1), y);
                int g = Fotari.vihrea((w-x-1), y);
                int b = Fotari.sininen((w-x-1), y);
                Fotari.asetaVari(x, y, r, g, b);
            }
        }
    }
    

    public static void vaalenna() {
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);

                Fotari.asetaVari(x, y,
                        Math.min(255, punainen + 30),
                        Math.min(255, vihrea + 30),
                        Math.min(255, sininen + 30));

                y++;
            }
            x++;
        }
    }
    
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

}
