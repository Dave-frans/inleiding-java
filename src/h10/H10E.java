package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10E extends Applet {
    TextField ty;
    boolean firstNumber;
    int maxInput;
    int minInput;
    int userInput;
    int Number;
    double gemiddelde;
    String sorry, tekst;

    public void init() {
        ty = new TextField(20);
        ty.addActionListener(new TekstListener());
        add(ty);
        maxInput = 0;
        minInput = 0;
        Number = 0;
        firstNumber = true;
        sorry = "";
        tekst = "";


    }
    public void paint(Graphics g) {
        g.drawString(sorry, 50, 160);
        g.drawString(tekst, 50 ,180);


    }
    class TekstListener implements  ActionListener {

        public void actionPerformed(ActionEvent e) {
            String userInputString = ty.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstNumber) {
                firstNumber = false;
                maxInput = userInput;
                minInput = userInput;
                Number = userInput;
                repaint();
            } else {
                if (userInput > maxInput) {
                    maxInput = userInput;
                    sorry = "";
                    repaint();
                } else {
                sorry = "Cijfer: " + userInput + "   Cijfer: " + maxInput + "   Cijfer " + Number;
                gemiddelde = (userInput + maxInput + Number) / 3;
                tekst = gemiddelde + " Gemiddelde" + "  Je bent geslaagd";
                if
                (userInput > 10)
                    tekst = "Error te hoger cijfer";
                repaint();
                if (gemiddelde < 6)
                    tekst = gemiddelde + " Je bent niet geslaag";

                }
            }
        }

    }
}
