
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Opiskelija> lista = new ArrayList<Opiskelija>();
        
        String nimi;
        String numero;
        
        do {
            System.out.println("Nimi:");
            nimi = lukija.nextLine();
            
            if(nimi.length()>0) {
                System.out.println("Opiskelijanumero:");
                numero = lukija.nextLine();
                
                lista.add(new Opiskelija(nimi, numero));
            } else {
                break;
            }
            
        } while( true );
        
        for( Opiskelija o : lista) {
            System.out.println(o.toString());
        }

        System.out.println("Anna hakusana:");
        nimi = lukija.nextLine();
        
        System.out.println("Tulokset:");
        for(Opiskelija o : lista) {
            if(o.haeNimi().contains(nimi)) System.out.println(o.toString());
        }
    }
}