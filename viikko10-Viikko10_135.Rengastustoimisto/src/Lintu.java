
public class Lintu {

    private String nimi;
    private String latinankielinenNimi;
    private int rengastusvuosi;

    public Lintu(String nimi, String latinankielinenNimi, int rengastusvuosi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielinenNimi;
        this.rengastusvuosi = rengastusvuosi;
    }

    

    @Override
    public int hashCode() {
        return this.rengastusvuosi + this.latinankielinenNimi.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lintu other = (Lintu) obj;
        if ((this.latinankielinenNimi == null) ? (other.latinankielinenNimi != null) : !this.latinankielinenNimi.equals(other.latinankielinenNimi)) {
            return false;
        }
        if (this.rengastusvuosi != other.rengastusvuosi) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return this.latinankielinenNimi + " (" + this.rengastusvuosi + ")";
    }
}
