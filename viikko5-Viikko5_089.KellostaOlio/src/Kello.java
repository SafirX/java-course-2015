public class Kello {
    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;
   
    public Kello(int tunnitAlussa, int minuutitAlussa, int sekunnitAlussa) {
        this.tunnit = new YlhaaltaRajoitettuLaskuri(23, tunnitAlussa);
        this.minuutit = new YlhaaltaRajoitettuLaskuri(59, minuutitAlussa);
        this.sekunnit = new YlhaaltaRajoitettuLaskuri(59, sekunnitAlussa);
    }
    
    public void etene() {
        this.sekunnit.seuraava();
        
        if(this.sekunnit.arvo() == 0) {
            this.minuutit.seuraava();
            if(this.minuutit.arvo() == 0) {
                this.tunnit.seuraava();
            }
        }
    }
    
    public String toString() {
        // palauttaa kellon merkkijonoesityksen
        return String.format("%s:%s:%s", this.tunnit, this.minuutit, this.sekunnit);
    }
}
