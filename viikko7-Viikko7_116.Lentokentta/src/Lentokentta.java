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
public class Lentokentta {
    
    private HashMap<String,Lentokone> planes;
    private HashMap<String,Lento> flights;
    
    private Scanner s;
    
    public Lentokentta(Scanner reader) {
        s = reader;
        
        planes = new HashMap<String,Lentokone>();
        flights = new HashMap<String,Lento>();
        
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
    }
    
    public void hallinnoi() {
        String cmd;
        
        do {
            menu();
            System.out.printf("> ");
            cmd = s.nextLine();
            
            if( cmd.equals("1") ) newPlane();
            else if( cmd.equals("2") ) newFlight();
            
        } while( !cmd.equalsIgnoreCase("x"));
    }
    
    private void menu() {
        System.out.println("\nValitse toiminto:");
        System.out.println("[1] Lisää lentokone");
        System.out.println("[2] Lisää lento");
        System.out.println("[x] Poistu hallintamoodista");
    }
    
    public void tulostaKoneet() {
        
        for(String k : planes.keySet()) {
            System.out.println(planes.get(k));
        }
        
    }
    
    public void tulostaLennot() {
        
        for(String l : flights.keySet()) {
            System.out.println(flights.get(l));
        }
        
    }
    
    public void tulostaKone(String id) {
        System.out.println(planes.get(id));
    }
    
    /**
     * Create new plane on field
     */
    private void newPlane() {
        System.out.printf("\nAnna lentokoneen tunnus: ");
        String id = s.nextLine().toUpperCase();
        
        System.out.printf("\nAnna lentokoneen kapasiteetti: ");
        int capacity = Integer.parseInt(s.nextLine());
        
        planes.put(id, new Lentokone(id, capacity));
    }
    
    /**
     * New flight
     */
    private void newFlight() {
        System.out.printf("\nAnna lentokoneen tunnus: ");
        Lentokone kone = planes.get(s.nextLine().toUpperCase());
        
        System.out.printf("\nAnna lähtöpaikan tunnus: ");
        String from = s.nextLine().toUpperCase();
        
        System.out.printf("\nAnna kohdepaikan tunnus: ");
        String to = s.nextLine().toUpperCase();
        
        flights.put(from+"-"+to, new Lento(kone, from, to));
    }
}
