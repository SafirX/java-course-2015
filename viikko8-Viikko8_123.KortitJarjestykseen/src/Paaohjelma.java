
public class Paaohjelma {

    public static void main(String[] args) {
Kasi kasi = new Kasi();

  kasi.lisaa( new Kortti(12, Kortti.HERTTA) );
  kasi.lisaa( new Kortti(4, Kortti.PATA) );
  kasi.lisaa( new Kortti(2, Kortti.RUUTU) );
  kasi.lisaa( new Kortti(14, Kortti.PATA) );
  kasi.lisaa( new Kortti(7, Kortti.HERTTA) );
  kasi.lisaa( new Kortti(2, Kortti.PATA) );

  kasi.jarjestaMaittain();

  kasi.tulosta();
    }
}
