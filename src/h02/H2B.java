package h02;

import java.applet.Applet;
import java.awt.*;

public class H2B extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Daviangelo", 50, 60 );
        g.setColor(Color.RED );
        g.drawString("Frans", 50, 73 );
    }
}
