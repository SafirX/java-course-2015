
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GraafinenLaskin implements Runnable {
    private JFrame frame;

    private javax.swing.JButton plus;
    private javax.swing.JButton minus;
    private javax.swing.JButton zero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    
    private static class EventListener implements ActionListener {
        
        private final javax.swing.JTextField fLuku;
        private final javax.swing.JTextField fTulos;
        private final javax.swing.JButton plus;
        private final javax.swing.JButton minus;
        private final javax.swing.JButton zero;
        
        private int luku = 0;

        public EventListener(javax.swing.JTextField a, 
                            javax.swing.JTextField b,
                            javax.swing.JButton plus,
                            javax.swing.JButton minus,
                            javax.swing.JButton zero) {
            this.fLuku = a;
            this.fTulos = b;
            this.plus = plus;
            this.minus = minus;
            this.zero = zero;
            this.fTulos.setText(this.luku+"");
        }
        
        

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(!isInteger(this.fLuku.getText())) {
                this.fLuku.setText("");
                if(e.getSource() == zero) {
                    this.luku = 0;
                }
            } else {

                if(e.getSource() == plus) {
                    this.luku += Integer.parseInt(this.fLuku.getText());    
                } else if( e.getSource() == minus) {
                    this.luku -= Integer.parseInt(this.fLuku.getText());
                } else {
                    this.luku = 0;
                }
                
                this.fLuku.setText("");
            }
            
            this.fTulos.setText(this.luku+"");
            if(this.luku == 0) this.zero.setEnabled(false);
            else this.zero.setEnabled(true);
        }
        
        private static boolean isInteger(String s) {
            try { 
                Integer.parseInt(s);
            } catch(NumberFormatException e) { 
                return false; 
            }
            
            return true;
        }
    }
    
    @Override
    public void run() {
        frame = new JFrame();
        frame.setTitle("Laskin");
        frame.setPreferredSize(new Dimension(300,150));
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }

    private void luoKomponentit(Container container) {
        
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        
        jPanel1 = new javax.swing.JPanel();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        zero.setEnabled(false);
        
        jTextField1.setText("0");
        jTextField2.setText("0");
        //jTextField2.setEditable(false);
        jTextField2.setEnabled(false);
        
        container.setLayout(new java.awt.GridLayout(3, 1));
        container.add(jTextField2);
        container.add(jTextField1);
        

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        plus.setText("+");
        EventListener listener = new EventListener(jTextField1, jTextField2, plus, minus, zero);
        plus.addActionListener(listener);
        minus.addActionListener(listener);
        zero.addActionListener(listener);
        jPanel1.add(plus);

        minus.setText("-");
        jPanel1.add(minus);

        zero.setText("Z");
        jPanel1.add(zero);

        container.add(jPanel1);

        
    }

    public JFrame getFrame() {
        return frame;
    }
}