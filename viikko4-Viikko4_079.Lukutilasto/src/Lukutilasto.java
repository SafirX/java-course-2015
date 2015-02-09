
public class Lukutilasto {
    
    private int lukujenMaara;
    private int summa = 0;
    
    public Lukutilasto() {
        
    }
    
    public void lisaaLuku(int luku) {
        // Code here
        this.lukujenMaara++;
        this.summa += luku;
    } 
   
    public int haeLukujenMaara() {
        // Code here
        return this.lukujenMaara;
    }
    
    public int summa() {
        // Code here
        return this.summa; 
    }
    
    public double keskiarvo() {
        if( this.haeLukujenMaara() > 0)
            return (double)this.summa / this.haeLukujenMaara();
        else
            return 0;
    }
}
