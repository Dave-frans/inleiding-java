package h13;

import java.applet.Applet;
import java.awt.*;

public class H13D extends Applet {

    public void init() {

        setSize(500, 500);


    }

    public void paint(Graphics g) {
        //Ik heb dit gedaan zodat ik de methode kon aan maken.
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        tekenBoom(g, x, y, width, height);
    }

    void tekenBoom(Graphics g, int x, int y, int width, int height) {
        // Dit is de code van de eerste rij bomen dit gedeelte is de bladeren.

        int centerX = 400;
        int centerY = 400;

// diameter 1 de breedte tussen de bomen en diameter2 de hoogte van de bomen op de applet.
        for (int i = 0; i < 5; i++) {
            int diameter1 = 90 * i;
            int diameter2 = 380;
//Hier maak ik de coordinaties aan centers zijn van de applet.
            int x1 = centerX - diameter1;
            int y1 = centerY - diameter2;

//deze cordinaties zijn van de cirkel dus de bladeren van de boom ze zijn gelijk om de bol een ronde cirkel te maken.
            int x2 = 80;
            int y2 = 80;

//gegevens van de cirkel
            g.setColor(Color.green);
            g.fillOval(x1, y1, x2, y2);
            g.setColor(Color.black);
            g.drawOval(x1, y1, x2, y2);
        }
// Dit gedeelte is ook van de eerste rij bomen en dit is de stam
        int centerX1 = 430;
        int centerY1 = 400;


        for (int j = 0; j < 5; j++) {
            int diameter1 = 90 * j;
            int diameter2 = 305;

            int x1 = centerX1 - diameter1;
            int y1 = centerY1 - diameter2;


            int x2 = 20;
            int y2 = 80;
//de g.setColor is een formule om de kleur bruin te krijgen want die kon ik niet vinden.
            g.setColor(new Color(60, 60, 0));
            g.fillRect(x1, y1, x2, y2);
        }

        // Dit is het gedeelte van de tweede rij bomen. En dit is weer bladeren.
        int centerX2 = 400;
        int centerY2 = 650;


        for (int i = 0; i < 5; i++) {
            int diameter1 = 90 * i;
            int diameter2 = 380;

            int x1 = centerX2 - diameter1;
            int y1 = centerY2 - diameter2;


            int x2 = 80;
            int y2 = 80;


            g.setColor(Color.green);
            g.fillOval(x1, y1, x2, y2);
            g.setColor(Color.black);
            g.drawOval(x1, y1, x2, y2);
        }
        // Dit gedeelte is ook van de tweede rij bomen en dit is de stam
        int centerX3 = 430;
        int centerY3 = 650;


        for (int j = 0; j < 5; j++) {
            int diameter1 = 90 * j;
            int diameter2 = 305;

            int x1 = centerX3 - diameter1;
            int y1 = centerY3 - diameter2;


            int x2 = 20;
            int y2 = 80;

            g.setColor(new Color(60, 60, 0));
            g.fillRect(x1, y1, x2, y2);



        }
    }
}

