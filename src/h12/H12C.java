package h12;
import java.applet.Applet;

import java.awt.*;

import java.awt.event.*;
import java.util.Arrays;

public class H12C extends Applet  {

    Label lab1;
    Button knop;

    TextField t1, t2, t3, t4, t5;
    double d, d2, d3, d4, d5;

    double[] arr = {d, d2, d3, d4, d5};


    public void init() {

        lab1 = new Label("Enter your numbers");

        add(lab1);

        t1 = new TextField(5);
        add(t1);
        t2 = new TextField(10);
        add(t2);
        t3 = new TextField(10);
        add(t3);
        t4 = new TextField(10);
        add(t4);
        t5 = new TextField(10);
        add(t5);


        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);

        Arrays.sort(arr);

    }

    public void paint(Graphics g) {

        g.drawString("The Numbers Are " + d + "  " + d2 + "  " + d3 + "  " + d4 + "  " + d5, 10, 100);
        g.drawString("The sorted numbers are as followed: " + arr, 10, 130);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            d = Integer.parseInt(t1.getText());

            d2 = Double.parseDouble(t2.getText());

            d3 = Double.parseDouble(t3.getText());

            d4 = Double.parseDouble(t4.getText());

            d5 = Double.parseDouble(t5.getText());




            repaint();

        }
    }
}


