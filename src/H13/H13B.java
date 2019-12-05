package H13;

import java.applet.Applet;
import java.awt.*;

public class H13B extends Applet {


    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        int width = 40;
        int height = 20;

        tekenRodeMuur(g, x, y, width, height);
    }

    void tekenRodeMuur(Graphics g, int x, int y, int width, int height) {
        for (int i = 0; i < 20; i++) {
            x = 20;
            for (int j = 0; j < 20; j++) {
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, width, height);
                x += width;
            }
            y += height;
        }
    }
}