
public class Main {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        
        for( int i = 0; i < taulukko.length; i++ ) {
            
            System.out.printf("%d", taulukko[i]);
            if( i < taulukko.length-1) System.out.printf(", ");
            
        }
    }
}
