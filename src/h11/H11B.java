package h11;

import java.awt.*;
import java.applet.*;


public class H11B extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        while(teller < 11) {
            y += 20;
            g.drawLine(50 , 20, 50, 180);
            g.drawString("" + teller, 50, 195 );
            teller++;
        }
    }
}