import java.awt.*;

import java.applet.*;



public class H11B extends Applet

{
    TextField textField1;
    TextField textField2;



    public void init()

    {
        textField1 = new TextField(5);
        textField2 = new TextField(5);
        add(textField1);
        add(textField2);
        textField1.getText();
        textField2.getText();

    }



    public void paint(Graphics g)

    {
//int start is voor de eerste tekstvak want dat is de eerste cijfer die je kiest bij einde is het de laatste cijfer.
        //int rij is zodat ze onder elkaar komen.
        //count = start want het begint daar en count > einde is waar het stopt.
        g.drawString("Zet de numbers die u wilt in de vakken.", 50, 45);
        String s = textField1.getText();
        int start = Integer.parseInt(s);
        s = textField2.getText();
        int einde = Integer.parseInt(s);
        int rij = 0;
        int count = start;
        while (count > einde)

        {
            //s += String nog wat is zodat het naar benenden telt.
            // en die g.drawstring is voor de rij zodat de cijfers onder elkaar komen.
            s = "Aftelling = ";
            s += String.valueOf(count--);
            g.drawString(s, 80, rij * 15 + 70);
            ++rij;

        }

    }



    public boolean action(Event event, Object arg)

    {
        repaint();
        return true;

    }

}
