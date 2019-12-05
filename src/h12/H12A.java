
import java.applet.Applet;
import java.awt.Graphics;


public class H12A extends Applet {
    int[] getallen = {3, 10, 34, 100, 6, 23, 74, 90, 101, 45, 9};
    int totaal;
    int aantal;
    double gemiddelde;


    public void init() {
        totaal = 0;
        aantal = 0;
        for (int i = 0; i < getallen.length; i++) {
            totaal = totaal + getallen[i];
            aantal++;
        }
        gemiddelde = (double) totaal / aantal;


    }


    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde, 40, 170);

        for (int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], 50, 120 * teller / 8);


        }
    }
}