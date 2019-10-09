package h04;

import java.applet.Applet;
import java.awt.*;

public class H4A extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 120, 270, 52);
        g.drawLine(50, 120, 270, 210);
        g.drawLine(270, 52, 270, 210);
    }
}