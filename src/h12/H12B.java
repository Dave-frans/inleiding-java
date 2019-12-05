package h12;

import java.applet.*;
import java.awt.*;
public class H12B extends Applet {

    String tekst = "Dit zijn 25 knoppen die niks doen";
    Button knoppen[] = new Button [26];


    public void init () {
        for (int i=1; i<26; i++) {
            knoppen [i] = new Button ("" + i );
            add (knoppen[i]);
        }
    }
    public void paint (Graphics g) {
        g.drawString (tekst, 30, 120);
    }

    public boolean action (Event e, Object o) {
        for (int i=1; i<26; i++) {
            if (e.target == knoppen [i] )  {
                repaint();
                return true;
            }
        }
        return false;
    }

}