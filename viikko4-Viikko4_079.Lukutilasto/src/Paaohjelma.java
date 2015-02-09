import java.util.Scanner;

public class Paaohjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtäviä 79.3 ja 79.4 tehdessäsi
        
        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();
        
        int luku;
        System.out.println("Anna lukuja:");
        do {
            luku = Integer.parseInt(lukija.nextLine());
            if( luku != -1 ) {
                tilasto.lisaaLuku(luku);
                if( luku % 2 == 0) parilliset.lisaaLuku(luku);
                else parittomat.lisaaLuku(luku);
            }
            
        } while( luku != -1);
        
        System.out.printf("Summa: %d", tilasto.summa());
        System.out.printf("\nParillisten summa: %d", parilliset.summa());
        System.out.printf("\nParittomien summa: %d", parittomat.summa());
    }
}
