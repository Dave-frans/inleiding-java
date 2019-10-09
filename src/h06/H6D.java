package h06;

import javafx.beans.binding.DoubleExpression;

import java.applet.Applet;
import java.awt.*;

public class H6D extends Applet {
   double G1;
   double G2;
   double G3;
   double uitkomst;


    public void init() {
        G1 = 5.9;
        G2 =6.3;
        G3 = 6.9;
        uitkomst = (G1 + G2 + G3) /3;
        uitkomst = uitkomst * 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;




    }

    public void paint(Graphics g) {
        g.drawString("" + uitkomst, 85, 195);


    }
}
