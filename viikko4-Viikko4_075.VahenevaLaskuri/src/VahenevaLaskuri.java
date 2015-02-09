public class VahenevaLaskuri {
    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon
    private int saved;

    public VahenevaLaskuri(int arvoAlussa) {
        this.saved = arvoAlussa;
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        
        if( this.arvo > 0 ) this.arvo--;
        
    }

    public void nollaa() {
        this.arvo = 0;
    }
    
    public void palautaAlkuarvo() {
        this.arvo = this.saved;
    }
}
