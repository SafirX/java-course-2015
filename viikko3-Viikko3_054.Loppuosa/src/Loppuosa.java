import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna sana: ");
        String sana = lukija.nextLine();
        
        System.out.println("Loppuosan pituus:");
        int l = Integer.parseInt(lukija.nextLine());
        
        int from = sana.length() - l;
        
        System.out.printf("Tulos: %s", sana.substring(from, sana.length()));
    }
}
