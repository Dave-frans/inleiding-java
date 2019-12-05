package H13;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13C extends Applet {


    public void init() {

    }


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
        for (int i = 0; i < 20; i++) {
            x = 20;
            int height1 = 22;
            int width1 = 42;
            for (int j = 0; j < 20; j++) {
                g.setColor(Color.gray);
                g.fillRect(x, y, width1, height1);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, width1, height1);
                x += width1;
            }
            y += height1;
        }


            }
        }
