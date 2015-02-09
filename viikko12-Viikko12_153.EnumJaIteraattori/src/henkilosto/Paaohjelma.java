package henkilosto;

public class Paaohjelma {

    public static void main(String[] args) {
        Tyontekijat yliopisto = new Tyontekijat();
        yliopisto.lisaa(new Henkilo("Matti", Koulutus.FT));
        yliopisto.lisaa(new Henkilo("Pekka", Koulutus.FilYO));
        yliopisto.lisaa(new Henkilo("Arto", Koulutus.FT));

        yliopisto.tulosta();

        yliopisto.irtisano(Koulutus.FilYO);

        System.out.println("==");

        yliopisto.tulosta();
    }
}
