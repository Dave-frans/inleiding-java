import java.awt.*;
import java.applet.*;

public class H11C extends Applet {
    long[] fibonacci;

    public void init() {
        fibonacci = new long[20];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i;
        setSize(500, 500);

        for (i = 2; i < 20; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
    }

    public void paint(Graphics g) {
        // yPos is breedte tussen de Numbers.
        int yPos = 20;
        int i;

        for (i = 0; i < 20; i++) {
            g.drawString("" + fibonacci[i], 50, yPos);
            yPos += 20;
        }

    }
}