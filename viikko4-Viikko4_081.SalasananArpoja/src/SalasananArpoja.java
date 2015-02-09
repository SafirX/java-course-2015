import java.util.Random;

public class SalasananArpoja {
    private int pituus;
    private Random rand = new Random();
    private String hash = "abcdefghijklmnopqrstuvwxyz";

    public SalasananArpoja(int salasananPituus) {
        this.pituus = salasananPituus;
    }

    public String luoSalasana() {
        String pass = "";
        for( int i = 0; i < this.pituus; i++) {
            pass += hash.charAt(rand.nextInt((hash.length()-1)));
        }
        return pass;
    }
}
