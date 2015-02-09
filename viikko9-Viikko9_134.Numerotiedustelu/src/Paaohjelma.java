
import java.util.*;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Puhelinluettelo luettelo = new Puhelinluettelo(scan);
        
        luettelo.kaynnista();
    }
}
