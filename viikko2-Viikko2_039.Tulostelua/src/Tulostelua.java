
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        for(int i = 0; i < maara; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        for( int i = 0; i < sivunpituus; i++ ) {
            tulostaTahtia(sivunpituus);
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        
        for(int y = 0; y < korkeus; y++) {
            tulostaTahtia(leveys);
        }
    }

    public static void tulostaKolmio(int koko) {       
        for(int i = 1; i <= koko; i++) {
            tulostaTahtia(i);
        }
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

}
