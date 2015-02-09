
import java.util.Scanner;

public class MerkkijononKaantaminen {

    public static String kaanna(String merkkijono) {
        
        /*String ret = "";
        
        for( int i = (merkkijono.length()-1); i >= 0; i-- )
            ret = ret + merkkijono.charAt(i);
        */
        
        return new StringBuilder(merkkijono).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();
        System.out.println("Väärinpäin: " + kaanna(merkkijono));
    }
}
