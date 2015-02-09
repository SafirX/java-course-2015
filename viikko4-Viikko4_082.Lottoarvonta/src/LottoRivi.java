
import java.util.ArrayList;
import java.util.Random;

public class LottoRivi {

    private ArrayList<Integer> numerot = new ArrayList<Integer>();
    private Random arpoja = new Random();

    public LottoRivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot.clear();
        // Kirjoita numeroiden arvonta tänne käyttämällä metodia sisaltaaNumeron()
        Integer arvottu;
        
        do {
            arvottu = (1 + arpoja.nextInt(39));
            if(!this.numerot.contains(arvottu))
                this.numerot.add(arvottu);
        } while(this.numerot.size() < 7);
            
    }

    public boolean sisaltaaNumeron(int numero) {
        if( this.numerot.contains(numero) )
            return true;
        
        return false;
    }
}
