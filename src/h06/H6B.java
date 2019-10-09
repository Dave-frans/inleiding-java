package h06;

import java.applet.Applet;
import java.awt.*;

public class H6B extends Applet {
    double Seconden;
   int uur;
   int dag;
   int jaar;


    public void init() {
        Seconden = 60;
        uur = 60 * 60;
        dag = (24 * 60) * 60;
        jaar = 365 * 24 * 60 * 60;



    }

    public void paint(Graphics g) {
        g.drawString("" + uur, 50, 95);
        g.drawString("" + dag, 50, 115);
        g.drawString("" + jaar, 50, 135);
        g.drawString("Seconden in een uur", 120, 95 );
        g.drawString("Seconden in een dag", 120, 115 );
        g.drawString("Seconden in een jaar", 120, 135 );
       setBackground(Color.gray);
    }
}
