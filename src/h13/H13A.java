package h13;

import java.applet.Applet;
import java.awt.*;

public class H13A extends Applet {
    //Hier maak ik 5 int aan want dat worden de coordinaties van de driehoek.
    int x1, y1, x2, y2, x3;


    public void init() {
        //Die zijn de coordinaties van de driehoek.
        //ik heb setSize gebruikt om de applet te vergroten anders kan je de driehoek niet zien.
        setSize(800, 300);
        x1 = 360;
        y1 = 480;
        x2 = 120;
        y2 = 200;
        x3 = 600;



    }
    public void paint (Graphics g) {
        //hier maak ik mijn eigen void methode aan.
        tekenDriehoek(g, x1, y1, x2, y2, x3);

    }


    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3) {
        //In de void methode die ik heb gemaakt zet ik de coordinaties in lijnen g.drawLine is om de lijnen te tekenen.
        //ik heb een gelijkbenige driehoek gemaakt
        g.drawLine(x1, y2, y1, x2);
        g.drawLine(y1, x2, x3, y2);
        g.drawLine(x1, y2, x3, y2);


    }


}
