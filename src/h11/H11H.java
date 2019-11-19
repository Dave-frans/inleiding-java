package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class H11H extends Applet {

    public void init(){

        setSize(1250, 1250);
    }
    public void paint(Graphics g)
    {


        int centerX = 500;
        int centerY = 225;

        for(int i =0; i<100;i++)
        {
            int diameter1 = 5*i;
            int diameter2 = 5*i;

            int x1 = centerX-diameter1;
            int y1 = centerX-diameter2;


            int x2 = 2*diameter1;
            int y2 = 2*diameter2;


            g.drawOval(x1,y1,x2,y2);

        }
    }
}
