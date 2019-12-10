package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11K extends Applet {
    Button knop;
    int uitslag, teller, x, y, tafelteller;
    Boolean activator;

    public void init() {
        setSize(500, 800);

        knop = new Button("Ok");
        knop.addActionListener(new Vermenigvuldiger());
        add(knop);

        y = 80;
        uitslag = 0;
        teller = 0;
        tafelteller = 0;
        activator = false;
    }

    public void paint(Graphics g) {
        if (tafelteller <= 12) {
            if (activator == true) {
                while (teller < 12) {
                    teller++;
                    uitslag = tafelteller * teller;
                    g.drawString(tafelteller + " x " + teller + " = " + uitslag, 200, y);
                    y += 20;
                }
            }
        } else {
            activator = false;
            g.drawString("De tafels gaan tot 12.", 200, y);
        }
    }


    class Vermenigvuldiger implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            activator = true;
            tafelteller++;
            teller = 0;
            y = 80;
            repaint();
        }
    }

}