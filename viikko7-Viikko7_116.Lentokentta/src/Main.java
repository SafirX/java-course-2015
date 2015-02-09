
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Lentokentta kentta = new Lentokentta(s);
        
        kentta.hallinnoi();
        
        Lentopalvelu palvelu = new Lentopalvelu(kentta, s);
        
        palvelu.palvele();
        
    }
}
