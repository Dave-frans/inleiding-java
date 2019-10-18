package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8C extends Applet {
    TextField tekstvak;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het bedrag in");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("Het betaalbedrag = " + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s ) / 100 * 21;


            repaint();
        }
    }
}