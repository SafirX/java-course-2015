
public class Main {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        for(int i : taulukko) {
            for(int r = 0; r < i; r++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
