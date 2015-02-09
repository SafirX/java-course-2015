
public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // HUOM: oliomuuttujissa on määre final eli niiden arvoa ei voi muuttaa!
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }
    
    @Override
    public boolean equals(Object o) {
        if( o == null ) return false;
        
        if(getClass() != o.getClass()) return false;
        
        Rekisterinumero rek = (Rekisterinumero)o;
        
        return (rek.maa == maa && rek.rekNro == rekNro);
    }
    
    public int hashCode() {
        
        return this.maa.hashCode() + this.rekNro.hashCode();
    }
}
