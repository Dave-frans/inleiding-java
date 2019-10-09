import java.applet.Applet;
import java.awt.*;

public class H4C extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.fillRect(20, 90, 140, 30);
        g.setColor(Color.white);
        g.fillRect(20, 60, 140, 30);
        g.setColor(Color.red);
        g.fillRect(20, 30, 140, 30);
        g.setColor(Color.black);
        g.drawLine(20, 90, 20, 360);





    }
}