public class BinaariHaku {
    
    public static boolean hae(int[] taulukko, int etsittavaLuku) {
        int alku = 0;
        int loppu = taulukko.length - 1;

        while (alku <= loppu) {
            
            int puolivali = (alku + loppu) / 2;
            
            if (taulukko[puolivali] == etsittavaLuku) {
                return true;
            }

            
            if(taulukko[puolivali] > etsittavaLuku) {
                
                loppu = puolivali - 1;
                
            } else {
                
                alku = puolivali + 1;
            }
            
            
        }
        return false;
    }
}
