
import matopeli.Matopeli;
import java.util.ArrayList;
import java.util.Arrays;

public class Matoaly {
    
    private int[][] pelialue;
    
    private int omenaX;
    private int omenaY;
    

    public String annaSiirto(Matopeli peli) {
        // vaihtoehtoja ovat: YLOS, ALAS, VASEN, OIKEA

        pelialue = peli.annaAlusta();
        omenaX = peli.omenaX();
        omenaY = peli.omenaY();
        
        // voit käyttää allaolevaa tulostusta pelialueen
        // tulostamiseen konsoliin
        int matoX;
        int matoY;
        
        for (int y = pelialue[0].length - 1; y >= 0; y--) {
            for (int x = 0; x < pelialue.length; x++) {
                
                matoY = peli.matoY();
                matoX = peli.matoX();
                
                System.out.printf("X: %d, Y: %d\n", matoX, matoY);
                
                if(matoY == omenaY) {
                    
                    if( matoX < omenaX) return suunta("OIKEA", peli);
                    else return suunta("VASEN", peli);
                    
                } else {
                    if(matoY < omenaY) {
                        return suunta("YLOS", peli);
                    } else {
                        return suunta("ALAS", peli);
                    }
                }
            }
        }
        
        return suunta("YLOS", peli);
    }
    
    private String suunta(String pri, Matopeli peli) {
        
        ArrayList<String> dir = new ArrayList<String>(
                                Arrays.asList("YLOS","ALAS","OIKEA","VASEN")
                                );
        
        while(dir.size() > 0) {
            if(dir.contains(pri)) {
                if(vapaa(dir.get(dir.indexOf(pri)), peli)) {
                    return pri.toUpperCase();
                } else {
                    dir.remove(pri);
                }
            } else {
                if(vapaa(dir.get(0), peli)) {
                    return dir.get(0).toUpperCase();
                } else {
                    dir.remove(0);
                }
            }
        }
        
        return "YLOS";
    }
    
    private boolean vapaa(String suunta, Matopeli peli) {
        int x = peli.matoX();
        int y = peli.matoY();
        if(suunta.equalsIgnoreCase("vasen")) {
            x--;
        }
        
        if(suunta.equalsIgnoreCase("oikea")) {
            x++;
        }
        
        if(suunta.equalsIgnoreCase("ylos")) {
            y++;
        }
        
        if(suunta.equalsIgnoreCase("alas")) {
            y--;
        }
        
        
        
        // Check that in bounds of Y
        if(y >= (peli.korkeus()) || y <= 0) return false;
        
        // Check that in bounds of X
        if( x >= (peli.leveys()) || x <= 0) return false;
        
        int tila = peli.annaAlusta()[x][y];
        // Check if square is free
        return (tila == 0 || tila ==8);
    }
    
    private int tila(int x, int y) {
        return pelialue[x][y];
    }
}
