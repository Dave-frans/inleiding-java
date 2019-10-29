import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class H10F extends Applet {
    TextField ty;
    boolean firstNumber;
    int userInput;
    int Number;
    String sorry;

    public void init() {
        ty = new TextField(20);
        ty.addActionListener(new TekstListener());
        add(ty);
        Number = 0;
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
                Number = userInput;
                repaint();
            } else if (userInput < 3)
                sorry = "Slecht";
            repaint();
        }

        {
            if(userInput > 5)
                sorry = "Matig";
            repaint();
        }

        {
            if (userInput < 7)
                sorry = "Voldoende";
            repaint();
        }

        {
            if (userInput > 8)
                sorry = "Goed";
            repaint();
        }
        {
            if(userInput > 10)
                sorry = "Error cijfer klopt niet";
            repaint();




                }
            }
        }

