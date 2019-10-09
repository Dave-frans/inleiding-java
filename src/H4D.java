import java.applet.Applet;
import java.awt.*;

public class H4D extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 200, 400, 200);
        g.drawLine(50, 200, 50, 0);
        g.setColor(Color.orange);
        g.fillRect(50, 120, 40, 80);
        g.setColor(Color.green);
        g.fillRect(90, 60, 40, 140);
        g.setColor(Color.RED);
        g.fillRect(130, 40, 40, 160);
        g.setColor(Color.black);
        g.drawString("Valerie", 50, 220 );
        g.drawString("Hans", 100, 220 );
        g.drawString("Jeroen", 140, 220 );
        g.drawString("0 KG", 18, 200 );
        g.drawString("40 KG", 16, 125 );
        g.drawString("80 KG", 18, 68 );
        g.drawString("100 KG", 11, 50 );



    }
}