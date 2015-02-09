
public class Paaohjelma {

    public static void main(String[] args) {
        
    }
    
    public static int pienin(int[] t) {
        
        int min = t[0];
        
        for(int i : t) {
            if( i < min) min = i;
        }
        
        return min;
    }
    
    public static int pienimmanIndeksi(int[] t) {
        
        int min = t[0];
        int idx = 0;
        
        for(int i = 0; i < t.length; i++) {
            if( t[i] < min ) {
                min = t[i];
                idx = i;
            }
        }
        
        return idx;
    }

    public static int pienimmanIndeksiAlkaen(int[] t, int a) {
        
        int min = t[a];
        int idx = a;
        
        for(int i = a; i < t.length; i++) {
            if( t[i] < min) {
                min = t[i];
                idx = i;
            }
        }
        
        return idx;
        
    }
    
    public static void vaihda(int[] t, int a, int b) {
        
        int aa = t[a];
        int bb = t[b];
        
        t[a] = bb;
        t[b] = aa;
        
    }
    
    public static void jarjesta(int[] t) {
        
        int idx;
        
        for( int i = 0; i < t.length; i++ ) {
            
            idx = pienimmanIndeksiAlkaen(t, i);
            vaihda(t, i, idx);
        }
        
    }
}
