package h04;

import java.applet.*;
import java.awt.*;
public class H4F extends Applet {


    public void paint(Graphics g) {

        {
            g.setColor(Color.white);
            setBackground(Color.BLACK);
            g.drawLine(5, 1, 5, 600);
            g.drawLine(210, 1, 210, 600);
            g.drawLine(5, 600, 210, 600);

            g.setColor(Color.red);
            g.fillOval(55, 3,100,100);
            g.setColor(Color.black);

            g.setColor(Color.green);
            g.fillOval(55,205,100,100);
            g.setColor(Color.black);

            g.setColor(Color.yellow);
            g.fillOval(55,105,100,100);
            g.setColor(Color.black);




        }
    }
}











