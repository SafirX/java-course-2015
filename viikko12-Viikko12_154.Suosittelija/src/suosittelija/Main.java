package suosittelija;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Henkilo;
import suosittelija.domain.Arvio;
import suosittelija.comparator.HenkiloComparator;
import suosittelija.comparator.ElokuvaComparator;

public class Main {

    public static void main(String[] args) {

        ArvioRekisteri arviot = new ArvioRekisteri();

        Elokuva tuulenViemaa = new Elokuva("Tuulen viemää");
        Elokuva hiljaisetSillat = new Elokuva("Hiljaiset sillat");
        Elokuva eraserhead = new Elokuva("Eraserhead");

        Henkilo matti = new Henkilo("Matti");
        Henkilo pekka = new Henkilo("Pekka");
        Henkilo mikke = new Henkilo("Mikke");
        Henkilo thomas = new Henkilo("Thomas");

        arviot.lisaaArvio(matti, tuulenViemaa, Arvio.HUONO);
        arviot.lisaaArvio(matti, hiljaisetSillat, Arvio.HYVA);
        arviot.lisaaArvio(matti, eraserhead, Arvio.OK);

        arviot.lisaaArvio(pekka, tuulenViemaa, Arvio.OK);
        arviot.lisaaArvio(pekka, hiljaisetSillat, Arvio.HUONO);
        arviot.lisaaArvio(pekka, eraserhead, Arvio.VALTTAVA);

        arviot.lisaaArvio(mikke, eraserhead, Arvio.HUONO);


        Suosittelija suosittelija = new Suosittelija(arviot);
        System.out.println(thomas + " suositus: " +
                suosittelija.suositteleElokuva(thomas));
        System.out.println(mikke + " suositus: " +
                suosittelija.suositteleElokuva(mikke));
    }
}
