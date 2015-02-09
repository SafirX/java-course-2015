package ilmoitin;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class Ilmoitin implements Runnable {

    private JFrame frame;
    private JButton button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private JLabel label1;
    private JTextField textField1;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400,200));
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }    

    private void luoKomponentit(Container container) {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        textField1 = new JTextField();
        button1 = new JButton();
        label1 = new JLabel();

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Ikuna");
        frame.setResizable(false);
        container.setLayout(new java.awt.GridLayout(3, 1));

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setText("textField1");
        container.add(textField1);

        button1.setLabel("Päivitä");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        container.add(button1);

        label1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        label1.setText("label1");
        container.add(label1);
    }  
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.label1.setText(textField1.getText());
        this.textField1.setText("");
    }  
}
