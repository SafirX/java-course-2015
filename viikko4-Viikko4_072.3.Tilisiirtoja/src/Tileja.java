
public class Tileja {

    public static void main(String[] args) {
        
        Tili tiliA = new Tili("tili A", 100.0);
        Tili tiliB = new Tili("tili B", 0.0);
        Tili tiliC = new Tili("tili C", 0.0);
        
        tilisiirto(tiliA, tiliB, 50.0);
        tilisiirto(tiliB, tiliC, 25.0);
        
        
    }
    
    public static void tilisiirto(Tili from, Tili where, double amount) {
        
        from.otto(amount);
        where.pano(amount);
        
    }


}
