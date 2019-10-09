import java.applet.Applet;
import java.applet.Applet;
import java.awt.*;

public class H4E extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(110, 130, 80, 120, 90, 370);
    }
}
