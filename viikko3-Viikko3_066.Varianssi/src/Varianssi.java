import java.util.ArrayList;

public class Varianssi {
    // Kopioi tänne tehtävän 63 metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int summa = 0;
        for(int l : lista) summa += l;
        return summa;
    }
    
    // Kopioi tänne tehtävän 64 metodi keskiarvo
    public static double keskiarvo(ArrayList<Integer> lista) {
        return (double)summa(lista) / lista.size();
    }

    public static double varianssi(ArrayList<Integer> lista) {
        double ka = keskiarvo(lista);
        
        double alku = 0;
        
        for(int i : lista) {
            alku += Math.pow((i-ka),2);
        }
        
        return (alku/(lista.size()-1));
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("Varianssi: " + varianssi(lista));
    }

}
