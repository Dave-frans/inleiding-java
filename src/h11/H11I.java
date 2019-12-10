package h11;

import java.awt.*;
import java.applet.*;


public class H11I extends Applet {

    int i = 8;

    public void paint(Graphics g)
    {
        //x,y is coordinaties loop is om rijen aan temaken.
        int x, y;
        for (int rij = 0; rij < i; rij++) {
// col is horonzontal en rij is vertical.
            for (int col = 0; col < i; col++) {

                x = rij * 30;
                y = col * 30;
//aals rij % 2 == 0 dan wordt het zwart anders wordt het wit.
                if ((rij % 2 == 0) == (col % 2 == 0))
                    g.setColor(Color.BLACK);
                else
                    g.setColor(Color.WHITE);

                g.fillRect(x, y, 30, 30);
            }
        }
    }
}