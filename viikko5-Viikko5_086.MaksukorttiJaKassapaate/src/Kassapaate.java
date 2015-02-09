
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        
        if( maksu >= 2.50 ) {
            this.edulliset++;
            this.rahaa += 2.50;
            return this.vaihtorahat(maksu, 2.50);
        }
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        // edullinen lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        if( maksu >= 4.30 ) {
            this.maukkaat++;
            this.rahaa += 4.30;
            return this.vaihtorahat(maksu, 4.30);
        }
        return maksu;
    }
    
    public boolean syoEdullisesti(Maksukortti kortti) {
        if( kortti.saldo() >= 2.50) {
            this.edulliset++;
            kortti.otaRahaa(2.50);
            return true;
        }
        return false;
    }
    
    public boolean syoMaukkaasti(Maksukortti kortti) {
        if( kortti.saldo() >= 4.30) {
            this.maukkaat++;
            kortti.otaRahaa(4.30);
            return true;
        }
        return false;
    }
    
    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if( summa >= 0) {
            kortti.lataaRahaa(summa);
            this.rahaa += summa;
            // Mikäköhän tässä logiikka?!
        }
    }
    
    
    
    private double vaihtorahat(double maksu, double hinta) {
        return (maksu-hinta); // Oho
    }


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
