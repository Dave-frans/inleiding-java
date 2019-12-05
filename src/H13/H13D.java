package H13;

import java.applet.Applet;
import java.awt.*;

public class H13D extends Applet {


    public void paint(Graphics g) {
        int x = 75;
        int y = 75;
        int width = 100;
        int height = 100;

        tekenBoom(g, x, y, width, height);
    }

    void tekenBoom(Graphics g, int x, int y, int width, int height) {
        for (int i = 0; i < 20; i++) {
            g.setColor(Color.green);
                g.fillOval(75, 75, 100, 100);
                g.setColor(Color.black);
                g.drawOval(75, 75, 100, 100);


                g.setColor(new Color(60, 60, 0));
                g.fillRect(115, 175, 20, 100);
                x += width;
            }

        }
    }
