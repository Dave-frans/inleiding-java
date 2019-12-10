import java.awt.*;
import java.applet.*;

public class H11C extends Applet {
    long[] fibonacci;

    public void init() {
        //ik heb long gebruikt omdat de cijfers heel groot kunnen worden [20] is voor de hoeveelheid getallen.
        fibonacci = new long[20];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i;
        setSize(500, 500);
//hier geef ik de formule van fibonacci aan de formule van fibonnaci is dat hij telkens de eerste en volgende cijfer bij elkaar tellen.
        for (i = 2; i < 20; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
    }

    public void paint(Graphics g) {
        // yPos is breedte tussen de Numbers.
        int yPos = 20;
        int i;
// Hier geef ik aan dat ze de cijfers op die plek moeten zetten en dat het niet meer dan 20 cijfers moeten zijn.
        for (i = 0; i < 20; i++) {
            g.drawString("" + fibonacci[i], 50, yPos);
            yPos += 20;
        }

    }
}