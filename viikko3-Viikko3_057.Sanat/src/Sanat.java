import java.util.ArrayList;
import java.util.Scanner;

public class Sanat {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<String>();
        
        String input = "";
        
        do {
            System.out.println("Anna sana: ");
            input = lukija.nextLine();
            
            if(!input.isEmpty()) sanat.add(input);
            
        } while( !input.isEmpty() );
        
        System.out.println("Annoit seuraavat sanat");
        for(String t : sanat)
            System.out.println(t);
             
    }
}
