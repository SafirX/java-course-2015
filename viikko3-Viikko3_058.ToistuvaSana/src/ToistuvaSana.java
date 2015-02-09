
import java.util.ArrayList;
import java.util.Scanner;

public class ToistuvaSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<String>();
        
        String i;
        
        do {
            
            System.out.println("Anna sana:");
            i = lukija.nextLine();
            
            if( !i.isEmpty() ) {
                
                if( sanat.contains(i) ) {
                    System.out.printf("Annoit uudestaan sanan %s\n", i);
                    break;
                }
                
                sanat.add(i);
            }
            
        } while ( !i.isEmpty() );
        

    }
}
