import javax.xml.soap.Text;
import java.applet.Applet;

import java.awt.*;

import java.awt.event.*;
import java.util.Arrays;

public class Random extends Applet  {


    Button knop;
    TextField[] tekstvelden;
    int[] invoer;


    public void init() {

        tekstvelden = new TextField[5];
        invoer = new int[5];




        for (int i = 0; i <tekstvelden.length ; i++) {
            tekstvelden[i] = new TextField(10);
            add(tekstvelden[i]);

        }




        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);



    }



    public void paint(Graphics g) {



    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            // loop door je tekstvelden en haal de waardes op met getText() en converteer naar integer



            // stop de waardes in je int array genaamd invoer


            // sorteer invoer array


            // loop door invoer array en set de waardes in de tekstvakken






        }
    }
}
