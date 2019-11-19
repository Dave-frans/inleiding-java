package h11;

import java.awt.*;
import java.applet.*;


public class H11I extends Applet {

    int i = 8;

    public void paint(Graphics g)
    {
        int x, y;
        for (int rij = 0; rij < i; rij++) {

            for (int col = 0; col < i; col++) {

                x = rij * 30;
                y = col * 30;

                if ((rij % 2 == 0) == (col % 2 == 0))
                    g.setColor(Color.BLACK);
                else
                    g.setColor(Color.WHITE);

                g.fillRect(x, y, 30, 30);
            }
        }
    }
}