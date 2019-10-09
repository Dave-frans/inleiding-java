package h06;

import java.applet.Applet;
import java.awt.*;

public class H6A extends Applet {
    int geld;
    double a, b;
    double berekening;



    public void init() {
    geld = 113;
    a = 113;
    b = 4;
    berekening = a / b;

    }


    public void paint(Graphics g) {
        g.drawString("jan =", 20, 95 );
        g.drawString("ali =", 20, 115 );
        g.drawString("jeannette =", 20, 135 );
        g.drawString("Dave =", 20, 155 );
        g.drawString("" + berekening, 85, 95);
        g.drawString("" + berekening, 85, 115);
        g.drawString("" + berekening, 85, 135);
        g.drawString("" + berekening, 85, 155);
        g.drawString("" + berekening, 85, 155);
        g.drawString("Total: " + geld, 53, 175);
        g.drawString("euro", 120, 95 );
        g.drawString("euro", 120, 115 );
        g.drawString("euro", 120, 135 );
        g.drawString("euro", 120, 155 );
        g.drawString("euro", 120, 175 );



    }
}


