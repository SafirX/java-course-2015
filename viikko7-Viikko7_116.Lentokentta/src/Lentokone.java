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
public class Lentokone {
    
    private final String id;
    private final int capacity;
    
    public Lentokone(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    
    public String id() {
        return id;
    }
    
    public int capacity() {
        return capacity;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%d henkilöä)", id, capacity);
    }
    
}
