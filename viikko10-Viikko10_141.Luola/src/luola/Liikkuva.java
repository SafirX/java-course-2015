/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luola;

/**
 *
 * @author jecode
 */
public abstract class Liikkuva {
    
    private Coords sijainti;
    
    public Liikkuva(int x, int y) {
        this.sijainti = new Coords(x, y);
    }
    
    public Liikkuva(int x, int y, int maxX, int maxY) {
        this.sijainti = new Coords(x, y, maxX, maxY);
    }
    
    public Liikkuva(Coords c) {
        this.sijainti = c;
    }
    
    public void liiku(char suunta) {
        this.sijainti.liiku(suunta + "");
    }
    
    public void liiku(String suunta) {
        this.sijainti.liiku(suunta);
    }
    
    public void asetasijainti(Coords c) {
        this.sijainti = c;
    }
    
    public int getX() {
        return sijainti.getX();
    }
    
    public int getY() {
        return sijainti.getY();
    }   
    
    public Coords sijainti() {
        return this.sijainti;
    }
    
}
