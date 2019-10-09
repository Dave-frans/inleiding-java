import java.applet.Applet;
import java.awt.*;

public class H6C extends Applet {
    int getal1;
    int getal2;
    int berekening;



    public void init() {
        getal1 = 2147483647;
        getal2 = 2;
        berekening = getal1 + getal2;




    }

    public void paint(Graphics g) {
        g.drawString("" + berekening, 85, 135);

    }
}
