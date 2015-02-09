/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;
import java.util.*;

/**
 *
 * @author jecode
 */
public class Navetta {

    private final Maitosailio sailio;
    private Lypsyrobotti robotti;
    
    public Navetta(Maitosailio sailio) {
        this.sailio = sailio;
    }
    
    public Maitosailio getMaitosailio() {
        return this.sailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti robotti) {
        robotti.setMaitosailio(this.sailio);
        this.robotti = robotti;
    }
    
    public void hoida(Lehma lehma) {
        this.tarkistaRobotti();
        
        this.robotti.lypsa(lehma);
    }
    
    public void hoida(Collection<Lehma> lehmat) {
        this.tarkistaRobotti();
        
        for(Lehma lehma : lehmat) {
            this.robotti.lypsa(lehma);
        }
    }
    
    private void tarkistaRobotti() {
        if(this.robotti == null) throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return this.sailio.toString();
    }
    
    
}
