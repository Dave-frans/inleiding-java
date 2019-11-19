package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class H11E extends Applet
{
    public void paint(Graphics g)
    {


        int centerX = 40;
        int centerY = 15;

        for(int i =0; i<5;i++)
        {
            int diameter1 = 10*i;
            int diameter2 = 10*i;

            int x1 = centerX+diameter1;
            int y1 = centerY+diameter2;


            int x2 = 10;
            int y2 = 10;


            g.drawRect(x1,y1,x2,y2);

        }
    }
}
