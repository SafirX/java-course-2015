/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author jecode
 */
public class Tahtitaivas {
    
    private int tiheys;
    private int w;
    private int h;
    private int stars = 0;
    private Random rnd = new Random();
   
    
    public Tahtitaivas(double tiheys, int width, int heigth) {
        this.tiheys = (int)(tiheys*100);
        this.w = width;
        this.h = heigth;
        System.out.printf("%d,%d,%d", this.tiheys, this.w, this.h);
    }
    
    public Tahtitaivas(double tiheys) {
        this.tiheys = (int)(tiheys*100);
        this.w = 20;
        this.h = 10;
        System.out.printf("%d,%d,%d", this.tiheys, this.w, this.h);
    }
    
    public Tahtitaivas(int w, int h) {
        this.tiheys = 10;
        this.w = w;
        this.h = h;
        System.out.printf("%d,%d,%d", this.tiheys, this.w, this.h);
    }
    
    public void tulostaRivi() {
        for(int x = 0; x < this.w; x++ ) {
            this.printStar();
        }
    }
    
    public void tulosta() {
        this.stars = 0;
        
        for(int y = 0; y < this.h; y++ ) {
            
            this.tulostaRivi();
            System.out.printf("\n");
        }
    }
    
    public int tahtiaViimeTulostuksessa() {
        return this.stars;
    }
    
    private void printStar() {
        if(this.tiheys >= rnd.nextInt(100)) {
            this.stars++;
            System.out.printf("*");
        } else {
            System.out.printf(" ");
        }
    }
    
}
