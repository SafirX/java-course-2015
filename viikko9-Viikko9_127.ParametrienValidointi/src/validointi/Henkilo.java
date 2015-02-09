package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        
        if(nimi == null || nimi.isEmpty() || nimi.length() > 40)
            throw new IllegalArgumentException();
        
        if( ika < 0)
            throw new IllegalArgumentException();
        if( ika > 120)
            throw new IllegalArgumentException();
            
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
