
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<String>();
    }

    public void lisaaAteria(String ateria) {
        if(!this.ateriat.contains(ateria))
            ateriat.add(ateria);
    }
    
    public void tulostaAteriat() {
        for( String ateria : this.ateriat) {
            System.out.println(ateria);
        }
    }
    
    public void tyhjennaRuokalista() {
        
        this.ateriat.clear();
        
    }
}
