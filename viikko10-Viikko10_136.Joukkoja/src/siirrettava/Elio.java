/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siirrettava;

/**
 *
 * @author jecode
 */
public class Elio implements Siirrettava {

    private int posX;
    private int posY;

    public Elio(int posX, int poxY) {
        this.posX = posX;
        this.posY = poxY;
    }

    
    
    
    @Override
    public void siirra(int dx, int dy) {
        posX += dx;
        posY += dy;
    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", posX, posY);
    }
    
    
}
