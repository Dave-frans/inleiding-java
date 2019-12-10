package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class H11F extends Applet
{
    public void paint(Graphics g)
    {

//zelfde code als bij H11E maar alleen als eindpunt g.drawOval.
        int centerX = 150;
        int centerY = 225;

        for(int i =0; i<5;i++)
        {
            int diameter1 = 10*i;
            int diameter2 = 10*i;

            int x1 = centerX-diameter1;
            int y1 = centerY-diameter2;


            int x2 = 2*diameter1;
            int y2 = 2*diameter2;


            g.drawOval(x1,y1,x2,y2);

        }
    }
}
