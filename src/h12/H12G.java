package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H12G extends Applet {
    TextField tekstvak, textField1, textField2, textField3, textField4;
    Label label;
    double getal, getal1, getal2, getal3, getal4, getal5;
    String[] namen;

    public void init() {
        tekstvak = new TextField("", 3);
        textField1 = new TextField("", 3);
        textField2 = new TextField("", 3);
        textField3 = new TextField("", 3);
        textField4 = new TextField("", 3);

        label = new Label("Type het bedrag in");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);

    }

    public void paint(Graphics g) {
        g.drawString("Het betaalbedrag = " + getal, 50, 60);
        g.drawString("Namen" + namen, 50, 50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            String s1 = textField1.getText();
            String s2 = textField2.getText();
            String s3 = textField3.getText();
            String s4 = textField4.getText();
            getal = getal + getal1 + getal2 + getal3 + getal4 + getal5;
            getal = Double.parseDouble(s) / 100 * 21;

            getal2 = Double.parseDouble(s) / 100 * 21;
            getal3 = Double.parseDouble(s) / 100 * 21;
            getal4 = Double.parseDouble(s) / 100 * 21;
            getal5 = Double.parseDouble(s) / 100 * 21;
            String namen = s1;


            }




        }
    }
