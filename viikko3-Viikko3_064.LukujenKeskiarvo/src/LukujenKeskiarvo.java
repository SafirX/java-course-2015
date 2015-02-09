
import java.util.ArrayList;

public class LukujenKeskiarvo {

    // Kopioi tänne edellisen tehtävän metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int summa = 0;
        for(int luku : lista) summa += luku;
        
        return summa;
    }
    

    public static double keskiarvo(ArrayList<Integer> lista) {
        return (double)summa(lista) / lista.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("Keskiarvo: " + keskiarvo(lista));
    }
}