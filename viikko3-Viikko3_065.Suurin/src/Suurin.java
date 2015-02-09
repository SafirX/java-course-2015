import java.util.ArrayList;

public class Suurin {
    public static int suurin(ArrayList<Integer> lista) {
        int isoin = lista.get(0);
        
        for(int luku : lista ) isoin = (luku>isoin?luku:isoin);
        
        return isoin;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("Suurin: " + suurin(lista));
    }
}