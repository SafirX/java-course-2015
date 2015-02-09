/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jecode
 */
public class Henkilo {
    
    private String nimi;
    private String puh;
    
    public Henkilo(String nimi, String puhelin) {
        this.nimi = nimi;
        this.puh = puhelin;
    }
    
    public void vaihdaNumeroa(String uusiNumero) {
        this.puh = uusiNumero;
    }
    
    public String haeNimi() {
        return this.nimi;
    }
    
    public String haeNumero() {
        return this.puh;
    }
    
    @Override
    public String toString()  {
        return String.format("%s puh: %s", this.nimi, this.puh);
    }
}
