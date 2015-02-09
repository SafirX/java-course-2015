
public class Main {

    public static void main(String[] args) {
Tahtitaivas tahtitaivas = new Tahtitaivas(0.1, 39, 10);
tahtitaivas.tulosta();
System.out.println("Tähtiä: " + tahtitaivas.tahtiaViimeTulostuksessa());
System.out.println("");

tahtitaivas = new Tahtitaivas(0.2, 15, 6);
tahtitaivas.tulosta();
System.out.println("Tähtiä: " + tahtitaivas.tahtiaViimeTulostuksessa());
  
    }
}
