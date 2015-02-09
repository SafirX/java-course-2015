package kysely;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    
// Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration    

    @Override
    public void run() {
        
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(200,300));

        initComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }// </editor-fold>  
    
    public void initComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        frame.setTitle("Ikuna");

        jLabel1.setText("Oletko?");

        jCheckBox1.setText("Kyllä");


        jCheckBox2.setText("En");

        jLabel2.setText("Miksi?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Siksi.");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Koska se on kivaa!");

        jButton1.setText("Valmis");

        container.setLayout(layout);
        
        container.add(jLabel1);
        container.add(jCheckBox1);
        container.add(jCheckBox2);
        container.add(jLabel2);
        container.add(jRadioButton1);
        container.add(jRadioButton2);
        container.add(jButton1);
    }


    public JFrame getFrame() {
        return frame;
    }
}
