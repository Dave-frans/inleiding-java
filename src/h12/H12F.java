package h12;


import java.applet.Applet;
        import java.awt.Graphics;
        import java.awt.*;
        import java.awt.event.*;

public class H12F extends Applet implements ActionListener
{
    Label label;
    TextField input;
    int num;
    int index;
    int[] numArray = new int[20];
    int sum;
    int total;
    double gemiddelde;




    public void init ()
    {
        label = new Label("Enter numbers");
        input = new TextField(5);
        add(label);
        add(input);
        input.addActionListener(this);
        index = 0;
    }

    public void actionPerformed (ActionEvent ev)
    {
        int num = Integer.parseInt(input.getText());
        numArray[index] = num;
        index++;
        if (index == 20)
            input.setEnabled(false);
        input.setText("");
        sum = 0;
        for (int i = 0; i < numArray.length; i++)
        {
            sum += numArray[i];
        }
        total = sum;
        gemiddelde = total / index;





        repaint();

    }



    public void paint (Graphics graf)
    {


        graf.drawString("Total   = " + (total), 25, 85);
        graf.drawString("Average = " + (gemiddelde), 25, 100);




    }
}