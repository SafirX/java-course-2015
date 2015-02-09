
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KaikkiEri {

    public static boolean kaikkiEri(ArrayList<Integer> luvut) {
        
        ArrayList<Integer> list = new ArrayList<Integer>(luvut);
        Collections.sort(list);
        
        int last = list.get(0);
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == last && i > 0 ) return false;
            
            last = list.get(i);
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Anna lukuja, -99 lopettaa:");

        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -99) {
                break;
            }
            luvut.add(luku);
        }

        if (kaikkiEri(luvut)) {
            System.out.println("Kaikki syöttämäsi luvut olivat erisuuruisia");
        } else {
            System.out.println("Syöttämiesi lukujen joukossa oli samansuuruisia");
        }
    }
}
