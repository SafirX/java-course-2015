import java.util.Scanner;


public class Paaohjelma {

    // tee ohjelmaasi VAIN YKSI Scanner-olio
    // jos joudut käyttämään Scanneria muualta kuin luontipaikasta, välitä se parametrina

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String komento;
        
        Kirja k = new Kirja();
        String nimi;
        String lat;
        
        
        do {
            System.out.print("? ");
            komento = s.nextLine();
            
            if(komento.toLowerCase().matches("lisaa")) {
                System.out.print("Nimi:");
                nimi = s.nextLine();
                System.out.print("Latinankielinen nimi:");
                lat = s.nextLine();
                k.lisaa(new Lintu(nimi, lat)); 
            }

            if(komento.toLowerCase().matches("havainto")) {
                System.out.print("Mikä havaittu?");
                nimi = s.nextLine();
                if(!k.havaitse(nimi)) {
                    System.out.println("Ei ole lintu!");
                }
            }
            
            if(komento.toLowerCase().matches("tilasto")) {
                System.out.println(k);
            }
            
            if(komento.toLowerCase().matches("nayta")) {
                System.out.println("Mikä?");
                nimi = s.nextLine();
                
                if( k.haeLintu(nimi) != null)
                    System.out.println(k.haeLintu(nimi));
                
            }

            if(komento.toLowerCase().matches("lopeta")) {
                break;
            }
        } while(true);    
        
    }

}
