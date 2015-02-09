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
public class Coords {
    
    private int x;
    private int y;
    
    private final int boundX;
    private final int boundY;
    public Coords(int x, int y, int boundX, int boundY) {
        this.x = x;
        this.y = y;
        
        this.boundX = boundX;
        this.boundY = boundY;
    }
    
    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
        
        this.boundX = 10000;
        this.boundY = 10000;
    }
    
    public int getX() {return this.x;}
    public int getY() {return this.y;}
    
    public void liiku(String suunta) {
        if(suunta.equals("w") && (y-1 >= 0)) this.y--;
        else if(suunta.equals("s") && (y+1 < this.boundY)) this.y++;
        else if(suunta.equals("a") && (x-1 >= 0)) this.x--;
        else if(suunta.equals("d") && (x+1 < this.boundX)) this.x++;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.x;
        hash = 29 * hash + this.y;
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
        final Coords other = (Coords) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%d %d", this.x, this.y);
    }
    
    
    
    
}
