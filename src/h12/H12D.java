package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12D extends Applet implements ActionListener {
    private TextField tf;
    private Button button;
    private boolean isGevonden;
    private boolean isGeklikt;
    private int index;


    private int[] getallen = {4, 6, 8, 5, 55, 60};


    public void init() {
        tf = new TextField( 10);
        add(tf);

        button = new Button( "Ok");
        button.addActionListener(this);
        add(button);

        isGevonden = false;

    }
    public void paint(Graphics g) {
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
        isGevonden = false;
        int input = Integer.parseInt(tf.getText());
        isGeklikt = true;

        for(int i = 0; i < getallen.length; i++) {
            if (getallen[i] == input) {
                isGevonden = true;
                index = i;

            }
        }
        repaint();
    }
}