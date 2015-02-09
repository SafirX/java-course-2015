/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suosittelija.domain;

/**
 *
 * @author jecode
 */
public class Elokuva {
    
    private final String nimi;

    public Elokuva(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }
    
    

    @Override
    public String toString() {
        return String.format("%s", this.nimi);
    }

    @Override
    public int hashCode() {
        return this.nimi.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elokuva other = (Elokuva) obj;
        if ((this.nimi == null) ? (other.nimi != null) : !this.nimi.equals(other.nimi)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
