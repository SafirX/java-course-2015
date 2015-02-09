
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna 1. sana: ");
        String eka = lukija.nextLine();
        
        System.out.println("Anna 2. sana: ");
        String toka = lukija.nextLine();
        
        if( !eka.contains(toka) )
            System.out.printf("Sana '%s' ei ole sanan '%s' osana.", toka, eka);
        else
            System.out.printf("Sana '%s' on sanan '%s' osana.", toka, eka);
    }  
}
