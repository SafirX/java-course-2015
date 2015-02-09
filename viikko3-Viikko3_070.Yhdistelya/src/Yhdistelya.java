
import java.util.ArrayList;
import java.util.Collections;

public class Yhdistelya {

    public static void main(String[] args) {

        //Alustetaan listat
        //Allaolevia lukuja saa muuttaa testatessa
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();

        Collections.addAll(lista1, 4, 3);
        // addAll tekee saman kuin komennot:
        // lista1.add(4);
        // lista1.add(3);

        Collections.addAll(lista2, 5, 10, 7);
        // addAll tekee saman kuin komennot:
        // lista2.add(5);
        // lista2.add(10);
        // lista2.add(7);

        //Toteuta metodi yhdista ja testaa sen toimintaa eri listoilla
        //yhdista(lista1, lista2);
        System.out.println(lista1);
        System.out.println(lista2);

        // Toteuta tämän jälkeen metodi joukkoYhdista ja testaa sen toimintaa
        // eri listoilla
        // joukkoYhdista(lista1, lista2);
    }
    
    public static void yhdista(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        
        l1.addAll(l2);
    }
    
    public static void joukkoYhdista(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        
        for( int i : l2 ) {
            if( !l1.contains(i) ) l1.add(i);
        }
        
    }

}
