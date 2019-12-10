package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13C extends Applet {
    Button knop;
    Button knop1;
    Boolean bakstenen;
    Boolean betonblokken;


    public void init() {
//Hier maak ik de knoppen aan met de namen van de knoppen.
        knop = new Button("Rode blokken");
        knop.addActionListener(new knoplistener1());
        add(knop);

        knop1 = new Button("Grijze blokken");
        knop1.addActionListener(new knoplistener2());
        add(knop1);
    }

    class knoplistener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bakstenen = true;
            betonblokken = false;
            repaint();


        }


    }

    class knoplistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bakstenen = false;
            betonblokken = true;
            repaint();
        }


    }


    public void paint(Graphics g) {

        //Rode Muur coordinaties
        int x = 20;
        int y = 20;
        int width = 40;
        int height = 20;
//Dit is zoals ik bij H13B hebt uitgelegd dus de eerst loop is for verticale blokken de tweede voor horozontale blokken.
        if (bakstenen) {
            for (int i = 0; i < 20; i++) {
                x = 20;
                for (int j = 0; j < 20; j++) {
                    g.setColor(Color.RED);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.BLACK);
                    g.drawRect(x, y, width, height);
                    x += width;
                }
                y += height;
            }
        }
// hier is het zelfe alleen worden de blokken hier een beetje groter.
        // Grijze Muur
        if (betonblokken) {
            for (int i = 0; i < 20; i++) {
                x = 20;
                int height1 = 22;
                int width1 = 42;
                for (int j = 0; j < 20; j++) {
                    g.setColor(Color.gray);
                    g.fillRect(x, y, width1, height1);
                    g.setColor(Color.BLACK);
                    g.drawRect(x, y, width1, height1);
                    x += width1;
                }
                y += height1;

            }


        }


    }
}

