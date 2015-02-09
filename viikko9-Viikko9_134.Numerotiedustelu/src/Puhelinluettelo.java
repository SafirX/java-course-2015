/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author jecode
 */
public class Puhelinluettelo {

    private HashMap<String,Henkilo> luettelo = new HashMap<String,Henkilo>();
    private HashMap<String,Henkilo> numerot = new HashMap<String,Henkilo>();
    private final Scanner reader;
    
    public Puhelinluettelo(Scanner scan) {
        this.reader = scan;
        
        System.out.println("numerotiedustelu");
    }
    
    public void kaynnista() {
        String cmd;
        menu();
        do {
            System.out.printf("komento: ");
            cmd = reader.nextLine();
            
            suorita(cmd);
        } while(!cmd.equalsIgnoreCase("x"));
    }
    
    public void suorita(String cmd) {
        
        if(cmd.equals("1")) lisaaNumero();
        else if(cmd.equals("2")) haeNumerot();
        else if(cmd.equals("3")) numerolleHenkilo();
        else if(cmd.equals("4")) lisaaOsoite();
        else if(cmd.equals("5")) haeHenkilo();
        else if(cmd.equals("6")) poistaHenkilo();
        else if(cmd.equals("7")) filterList();
        
    }
    
    public void menu() {
        System.out.println("käytettävissä olevat komennot:");
        System.out.printf(  " 1 lisää numero\n" +
                            " 2 hae numerot\n" +
                            " 3 hae puhelinnumeroa vastaava henkilö\n" +
                            " 4 lisää osoite\n" +
                            " 5 hae henkilön tiedot\n" +
                            " 6 poista henkilön tiedot\n" +
                            " 7 filtteröity listaus\n" +
                            " x lopeta\n");
    }
    
    public void lisaaNumero() {
        kysy("kenelle");
        String nimi = reader.nextLine();
        kysy("numero", 0);
        String numero = reader.nextLine();
        
        if(luettelo.get(nimi) == null) {
            Henkilo h = new Henkilo(nimi, numero);
            
            luettelo.put(nimi, h);
            numerot.put(numero, h);
        } else {
            Henkilo h = luettelo.get(nimi);
            
            luettelo.get(nimi).lisaaNumero(numero);
            numerot.put(numero, h);
        }
        System.out.println("");
    }
    
    public void haeNumerot() {
        kysy("kenen", 0);
        String nimi = reader.nextLine();
        
        if(!luettelo.containsKey(nimi)) {
            System.out.println("  ei löytynyt");
        } else {
            for(String numero : luettelo.get(nimi).numerot()) {
                System.out.printf("  %s\n", numero);
            }
        }
    }
    
    public void lisaaOsoite() {
        kysy("kenelle");
        String nimi = reader.nextLine();
        kysy("katu", 0);
        String katu = reader.nextLine();
        kysy("kaupunki", 0);
        String kaupunki = reader.nextLine();
        
        if(luettelo.get(nimi) != null)
            luettelo.get(nimi).lisaaOsoite(katu + " " + kaupunki);
        else {
            Henkilo h = new Henkilo(nimi);
            h.lisaaOsoite(katu + " " + kaupunki);
            
            luettelo.put(nimi, h);
        }
            
        
        System.out.println("");
    }
    
    public void haeHenkilo() {
        kysy("kenen");
        String nimi = reader.nextLine();
        
        if(!luettelo.containsKey(nimi)) {
            System.out.println(" ei löytynyt");
        } else {
            System.out.println(luettelo.get(nimi).tiedot());
        }
    }
    
    public void numerolleHenkilo() {
        kysy("numero");
        String numero = reader.nextLine();
        
        if(!numerot.containsKey(numero)) {
            System.out.println(" ei löytynyt");
        } else {
            System.out.printf(" %s\n", numerot.get(numero).nimi());
        }
       
        
    }
    
    public void filterList() {
        
        kysy("hakusana (jos tyhjä, listataan kaikki)");
        String haku = reader.nextLine();
        ArrayList<Henkilo> result = new ArrayList<Henkilo>();
        
        for(String nimi : luettelo.keySet()) {
            
            if(luettelo.get(nimi).match(haku)) {
                result.add(luettelo.get(nimi));
            }
        }
        
        if(result.size() > 0) {
            Collections.sort(result);
            for(Henkilo h : result) {
                System.out.println(h);
            }
        } else {
            System.out.println(" ei löytynyt");
        }
        
    }
    
    public void poistaHenkilo() {
        kysy("kenet");
        String nimi = reader.nextLine();
        
        if(luettelo.get(nimi) != null) {
            Henkilo h = luettelo.get(nimi);
            
            for(String numero : h.numerot()) {
                numerot.remove(numero);
            }
            
            luettelo.remove(nimi);
        } else {
            System.out.println(" ei löytynyt");
        }
    }
    
    
    private void kysy(String mita) {
        System.out.printf("\n%s: ", mita);
    }
    private void kysy(String mita, int rivinvaihto) {
        if(rivinvaihto == 0) {
            System.out.printf("%s: ", mita);
        } else {
            System.out.printf("\n%s: ", mita);
        }
    }
    
    
    
    
    
    
}
