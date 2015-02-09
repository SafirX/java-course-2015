import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        
        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        int kertoma = 1;
        
        for(int i = 1; i <= luku; i++)
            kertoma *= i;
        
        System.out.printf("Kertoma on %d", kertoma);
    }
}
