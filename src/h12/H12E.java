package h12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12E extends Applet implements ActionListener {
    private TextField tf;
    private Button button;
    private boolean isGevonden;
    private boolean isGeklikt;
    private int index;
// de int getallen hier zijn de cijfers die ik heb gekozen.
    private int[] getallen = {4, 6, 8, 5, 55, 60};


    public void init() {
        //hier voeg ik de tekstvak en knop in.
        tf = new TextField( 10);
        add(tf);

        button = new Button( "Ok");
        button.addActionListener(this);
        add(button);

        isGevonden = false;

    }
     public void paint(Graphics g) {
       //Hier is de taak van Isgeklikt dat wanneer ik geklikt hebt op de knop en de waarde is gevonden dan moet hij de eerst optie gebruiken als het niet gevonden is de tweede optie.
        if (isGeklikt) {
            if (isGevonden) {
                g.drawString("De waarde is gevonden op index " + index, 50, 50);
            } else {
                g.drawString("De waarde is niet gevonden", 50, 80);
            }
        }
     }

     @Override
    public void actionPerformed(ActionEvent e) {
        //Hier
        isGevonden = false;
        int input = Integer.parseInt(tf.getText());
        isGeklikt = true;
//Hier geef ik aan dat i kleiner is dan getallen. als getallen gelijk is aan de input wordt gevonden true en dan komt de eerste optie van de g.drawString voor op de applet.
        for(int i = 0; i < getallen.length; i++) {
            if (getallen[i] == input) {
                isGevonden = true;
                index = i;
            }
        }
        //repaint is om te refreshen.
        repaint();
    }
}
