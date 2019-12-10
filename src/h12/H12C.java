package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class H12C extends Applet {
    TextField[] tekstvakken;
    int[] cijfers;
    Button knop;




    public void init() {


        tekstvakken = new TextField[5];
        cijfers = new int[5];
        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i] = new TextField("", 5);
            add(tekstvakken[i]);

        }
        knop = new Button("OK");
        knop.addActionListener(new Knoplistener());
        add(knop);


    }

    public void paint(Graphics g) {
        g.drawString("Vul 5 cijfers in en druk op ok", 30, 50);

    }

    class Knoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvakken.length; i++) {
                String invoer = tekstvakken[i].getText();
                cijfers[i] = Integer.parseInt(invoer);


            }
            Arrays.sort(cijfers);

            for (int i = 0; i < cijfers.length; i++) {
                tekstvakken[i].setText(String.valueOf(cijfers[i])); }




        }


    }

}
