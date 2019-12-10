import java.applet.Applet;
import java.awt.Graphics;

public class H11G extends Applet {

    public void init(){

        setSize(500, 500);

    }
    public void paint(Graphics g)
    {

//zelfde code weer maar alleen is het nu 50 keer.
        int centerX = 250;
        int centerY = 250;

        for(int i =0; i<50;i++)
        {
            int diameter1 = 5*i;
            int diameter2 = 5*i;

            int x1 = centerX-diameter1;
            int y1 = centerY-diameter2;


            int x2 = 2*diameter1;
            int y2 = 2*diameter2;


            g.drawOval(x1,y1,x2,y2);

        }
    }
}
