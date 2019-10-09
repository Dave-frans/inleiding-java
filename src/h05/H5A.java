package h05;

import java.applet.Applet;
import java.awt.*;

public class H5A extends Applet {

    Color Vullingskleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int Breedte_Cirkel;

    public void init() {
        Vullingskleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
        Breedte_Cirkel = 100;
    }

    public void paint(Graphics g) {
        g.drawLine(100, 60, 300, 60);
        g.drawString("Lijn", 180, 80 );
        g.drawRect(100, 100, breedte, hoogte);
        g.drawString("Rechthoek", 170, 215 );
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 140, 340 );
        g.setColor(Vullingskleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 340, 215 );
        g.drawOval(315, 100, breedte, hoogte);
        g.drawString("Gevulde ovaal", 365, 340 );
        g.setColor(Vullingskleur);
        g.fillOval(315, 225, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(545, 100,  200, hoogte);
        g.drawString("Taartpunt met ovaal eromheen", 560, 215 );
        g.setColor(Vullingskleur);
        g.fillArc(595, 115, 150, 60, 0, 40);
        g.setColor(lijnkleur);
        g.drawOval(595, 225, Breedte_Cirkel, hoogte);
        g.drawString("Cirkel", 630, 340 );
    }
}