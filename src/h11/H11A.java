package h11;

import java.awt.*;
import java.applet.*;


public class H11A extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;


        for(teller = 0; teller < 11; teller++) {
            y += 20;
            g.drawLine(50 , y, 50, 170);
            g.drawString("" + teller, 48, 195 );
        }
    }
}