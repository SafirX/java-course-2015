
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-60]: ");
        int a = Integer.parseInt(lukija.nextLine());
        
        String asana = "hylätty";
        
        if(a > 29) asana = "1";
        if(a > 34) asana = "2";
        if(a > 39) asana = "3";
        if(a > 44) asana = "4";
        if(a > 49) asana = "5";
        
        System.out.printf("Arvosana: %s", asana);
                
                
    }
}
