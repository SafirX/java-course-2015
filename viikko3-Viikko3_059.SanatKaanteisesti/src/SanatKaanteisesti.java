import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanatKaanteisesti {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<String>();
        
        String input;
        
        do {
            System.out.println("Anna sana: ");
            input = lukija.nextLine();
            
            if(input.isEmpty()) break;
            
            list.add(input);
            
        } while( !input.isEmpty() );
        
        Collections.reverse(list);
        
        System.out.println("Annoit seuraavat sanat:");
        for( String text : list ) {
            System.out.println(text);
        }
    }
}
