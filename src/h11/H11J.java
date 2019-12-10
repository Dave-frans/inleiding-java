package h11;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11J extends Applet {
    TextField tekstvak;
    Button knop;
    int getalinvoer, uitslag, teller, x, y;
    String s1;
    Boolean activator;

    public void init() {
        setSize(500, 800);
//Hier maak ik tekstvak en knop aan.
        tekstvak = new TextField("", 5);
        knop = new Button("Ok");
        knop.addActionListener(new Vermenigvuldiger());
        add(tekstvak);
        add(knop);

        //hier inizalieer ik namen die ik heb gemaakt.
        //als de activator false is dan werkt de knop niet maar als het true is dan werkt de knop wel.
        y = 80;
        getalinvoer = 0;
        uitslag = 0;
        teller = 0;
        activator = false;
    }

    public void paint(Graphics g) {
        //Hier geef ik aan als activator waar is dan moet uitslag die userinput is * teller en die wordt door g.drawstring op scherm gezeet. y += is het breedte tussen de cijfers.
        if (activator == true) {
            while (teller < 10) {
                teller++;
                uitslag = getalinvoer * teller;
                g.drawString(getalinvoer + " x " + teller + " = " + uitslag, 200, y);
                y += 20;
            }
        }
    }

    class Vermenigvuldiger implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //s1 krijgt de tekst van de tekstvak.
            // getalinvoer is een integer dus allen cijfers kunnen ingevult worden.
            // y is op welke hoogte ik het wil hebben dus de tafel.
            s1 = tekstvak.getText();
            getalinvoer = Integer.parseInt(s1);
            activator = true;
            teller = 0;
            y = 80;
            repaint();
        }
    }

}