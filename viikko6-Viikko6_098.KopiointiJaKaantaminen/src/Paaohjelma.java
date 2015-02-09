import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testauskoodia tänne
    }
    
    public static int[] kopioi(int[] t) {
        int[] k = t.clone();
        return k;
    }
    
    public static int[] kaanna(int[] t) {
        int[] k = new int[t.length];
        for(int i = (t.length-1); i >= 0; i--) {
            k[i] = t[t.length-1-i];
        }
        
        return k;
    }

}
