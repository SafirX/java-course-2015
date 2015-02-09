import java.util.ArrayList;

public class LaskeAlkiot {

    public static int laskeAlkiot(ArrayList<String> list) {
        int ret = 0;
        for(String e : list) ret++;
        
        return ret;
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Moi");
        lista.add("Ciao");
        lista.add("Hello");
        System.out.println("Listalla on alkioita:");
        // Voit ottaa kommenttimerkit alta pois kun olet lisännyt metodin laskeAlkiot
        System.out.println(laskeAlkiot(lista)); 
    }

}