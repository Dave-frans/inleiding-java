import java.applet.Applet;
import java.awt.*;

public class H4G extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        setBackground(Color.white);
        g.drawRect(20, 20, 100, 100);
        g.fillOval(35, 40,20,20);
        g.fillOval(35, 80,20,20);
        g.fillOval(85, 40,20,20);
        g.fillOval(85, 80,20,20);

    }
}
