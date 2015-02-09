
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }
    
    public Raha plus(Raha lisattava) {
        return new Raha((this.euroa+lisattava.eurot()), (this.senttia+lisattava.sentit()));
    }
    
    public boolean vahemman(Raha verrattava) {
        return (this.arvo() < verrattava.arvo());
    }
    
    public Raha miinus(Raha vahentaja) {
        int ero = (this.arvo()-vahentaja.arvo());
        if(ero>0) {
            return this.rahaksi(ero);
        }
        
        return new Raha(0,0);
    }
    
    public Raha rahaksi(int sentit) {
        int eurot = (int)Math.floor(sentit/100);
        int sent = (sentit-(eurot*100));
        return new Raha(eurot, sent);
    }
    
    public int arvo() {
        return (this.euroa*100 + this.senttia);
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }

}
