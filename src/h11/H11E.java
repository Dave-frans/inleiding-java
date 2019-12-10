package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class H11E extends Applet
{
    public void paint(Graphics g)
    {

//coordienatie van applet
        int centerX = 40;
        int centerY = 15;
//geeft aan dat ik 5 wil.
        for(int i =0; i<5;i++)
        {
            //breedte en hoogte van de vierkantjes
            int diameter1 = 10*i;
            int diameter2 = 10*i;

            int x1 = centerX+diameter1;
            int y1 = centerY+diameter2;


            int x2 = 10;
            int y2 = 10;

//vierkant hier.
            g.drawRect(x1,y1,x2,y2);

        }
    }
}
