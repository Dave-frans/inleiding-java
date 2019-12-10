import java.awt.*;
import java.applet.*;


public class H11A extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

//hier maak ik de lijnen aan dus 10 lijnen met de grote tussen hun 20.
        for(teller = 1; teller < 11; teller++) {
            x += 20;
            g.drawLine(x , 40, x, 200 );

        }
    }
}