package tervehtija.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        JFrame window = new JFrame("Swing on");
        window.setPreferredSize(new Dimension(410, 210));
        
        luoKomponentit(window.getContentPane());
        
        window.pack();
        window.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        JLabel teksti = new JLabel("Moi!");
        teksti.setBounds(0, 0, 410, 210);
        container.add(teksti);
    }

    public JFrame getFrame() {
        return frame;
    }
}
