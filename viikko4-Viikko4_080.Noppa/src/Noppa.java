
import java.util.Random;

public class Noppa {

    private Random random = new Random();
    private int tahkojenMaara;

    public Noppa(int tahkojenMaara) {
        this.tahkojenMaara = tahkojenMaara;
    }

    public int heita() {
        return this.random.nextInt(tahkojenMaara) + 1;
    }
}
