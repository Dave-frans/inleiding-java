package h04;

import java.applet.Applet;
import java.awt.*;

public class H4B extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 100);
        g.drawRect(40, 20, 20, 30);
        g.drawRect(80, 50, 20, 20);
        g.drawRect(100, 50, 20, 20);
        g.drawRect(60, 85, 20, 20);
        g.drawLine(20, 120, 60, 210);
        g.drawLine(120, 120, 60, 210);

    }
}