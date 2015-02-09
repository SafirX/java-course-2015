package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.Laskuri;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.*;
import clicker.sovelluslogiikka.OmaLaskuri;
import java.awt.event.ActionListener;

public class Kayttoliittyma implements Runnable {
    private JFrame frame;
    
    private JButton jButton1;
    private JLabel jLabel1;
    
    private final Laskuri laskuri;

    public Kayttoliittyma() {
        this.laskuri = new OmaLaskuri();
    }

    public Kayttoliittyma(Laskuri laskuri) {
        this.laskuri = laskuri;
    }
    
    @Override
    public void run() {
        frame = new JFrame("The Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        jLabel1 = new JLabel();
        jButton1 = new JButton();

        frame.setLayout(new BorderLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("0");
        container.add(jLabel1, BorderLayout.CENTER);

        jButton1.setText("Click!");
        
        jButton1.addActionListener(new KlikkaustenKuuntelija(this.laskuri, this.jLabel1));
        
        container.add(jButton1, java.awt.BorderLayout.PAGE_END);
    }

    public JFrame getFrame() {
        return frame;
    }
}
