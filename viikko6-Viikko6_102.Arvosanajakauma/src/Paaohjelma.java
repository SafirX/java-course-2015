import java.util.Scanner;
import java.util.ArrayList;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        ArrayList<Integer> pisteet = new ArrayList<Integer>();
        
        System.out.println("Syötä koepisteet, -1 lopettaa:");
        Integer p;
        
        do {
            p = Integer.parseInt(l.nextLine());
            if( p != -1) {
                pisteet.add(p);
            } else {
                break;
            }
        } while( true );
        
        tulostaJakauma(pisteet);
    }
    
    
    private static void tulostaJakauma(ArrayList<Integer> l) {
        
        int[] arvosanat = {0,0,0,0,0,0};
        int hyv = 0;
        int sanoja = 0;
        
        for( int p : l) {
            if( p>60) {
                continue;
            }
            if(p>=0)
                sanoja++;
            if(p>= 50 ) {
                arvosanat[5]++;
                hyv++;
                continue;
            }
            
            if(p>=45) {
                arvosanat[4]++;
                hyv++;
                continue;
            }
            
            if(p>=40) {
                arvosanat[3]++;
                hyv++;
                continue;
            }
            
            if(p>=35) {
                arvosanat[2]++;
                hyv++;
                continue;
            }
            
            if(p>=30) {
                arvosanat[1]++;
                hyv++;
                continue;
            }
            
            if(p>=0)
                arvosanat[0]++;
        }
        
        System.out.println("Arvosanajakauma");
        
        for(int i = 5; i >= 0; i--) {
            System.out.printf("\n%d: ", i);
            for(int b = arvosanat[i]; b > 0; b--)
                System.out.printf("*");
        }
        
        if(l.size() > 0 && hyv > 0) {
            double pros = ((double)hyv/sanoja) * 100;
            System.out.printf("\nHyväksymisprosentti: %f", pros);
        }
        else {
            System.out.printf("Hyväksymisprosentti: 0.0");
        }
        
    }
}
