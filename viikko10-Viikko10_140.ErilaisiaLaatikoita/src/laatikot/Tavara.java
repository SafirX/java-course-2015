package laatikot;

public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {

        this.nimi = nimi;
        
        if(paino < 0) throw new IllegalArgumentException();
        
        this.paino = paino;
    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.nimi != null ? this.nimi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tavara other = (Tavara) obj;
        if ((this.nimi == null) ? (other.nimi != null) : !this.nimi.equals(other.nimi)) {
            return false;
        }

        return true;
    }
    
    

}
