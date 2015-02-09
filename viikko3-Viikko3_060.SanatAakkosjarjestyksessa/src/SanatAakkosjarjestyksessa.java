
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanatAakkosjarjestyksessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> wList = new ArrayList<String>();
        
        String input;
        
        do {
            System.out.println("Anna sana: ");
            input = lukija.nextLine();
            
            if(input.isEmpty()) break;
            
            wList.add(input);
        } while( !input.isEmpty() );
        
        System.out.println("Annoit seuraavat sanat:");
        Collections.sort(wList);
        for(String word : wList)
            System.out.println(word);
    }
}
