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
public class Lento {
    
    private final Lentokone plane;
    private final String from;
    private final String to;

    public Lento(Lentokone plane, String from, String to) {
        this.plane = plane;
        this.from = from;
        this.to = to;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s-%s)", plane, from, to);
    }
}
