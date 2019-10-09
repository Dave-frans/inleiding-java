package h04;

import java.applet.Applet;
import java.awt.*;

public class H4H extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(180, 30, 10, 30);
        g.drawString("Lijn", 85, 50 );
        g.drawRect(10, 54, 160, 60);
        g.drawString("Rechthoek", 65, 130 );
        g.drawRoundRect(10, 135, 160, 70, 10, 10);
        g.drawString("Afgeronde rechthoek", 35, 220 );
        g.drawString("Gevulde rechthoek met ovaal", 180, 130 );
        g.setColor(Color.magenta);
        g.fillRect(200, 54, 120, 60);
        g.setColor(Color.black);
        g.drawOval(200, 54, 120, 60);
        g.setColor(Color.magenta);
        g.fillOval(200, 140, 120, 60);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 215, 215 );
        g.drawOval(355, 46, 150, 70);
        g.setColor(Color.magenta);
        g.fillArc(403, 50, 100, 50, 5, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 345, 130 );
        g.drawOval(380, 140, 60, 60);
        g.drawString("Cirkel", 395, 215 );




    }
}

