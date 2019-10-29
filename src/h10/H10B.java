import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10B extends Applet {
    TextField ty;
    boolean firstNumber;
    int maxInput;
    int minInput;
    int userInput;
    String sorry;

    public void init() {
        ty = new TextField(20);
        ty.addActionListener(new TekstListener());
        add(ty);
        maxInput = 0;
        minInput = 0;
        firstNumber = true;
        sorry = "";


    }
    public void paint(Graphics g) {
        g.drawString(sorry, 50, 160);


    }
    class TekstListener implements  ActionListener {

        public void actionPerformed(ActionEvent e) {
            String userInputString = ty.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstNumber) {
                firstNumber = false;
                maxInput = userInput;
                minInput = userInput;
                repaint();
            } else {
                if (userInput > maxInput) {
                    maxInput = userInput;
                    sorry = "";
                    repaint();
                } else {
                    sorry = "Min input: " + userInput + " Max input: " + maxInput;
                    repaint();

                }
            }
        }

    }
}