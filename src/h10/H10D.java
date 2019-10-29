import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10D extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {

        g.drawString(tekst, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {

            }
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 ==0)) ||
                    jaartal % 400 == 0 ) {
                tekst = "Februari heeft 29 dagen in "+ jaartal + " dus het is een schrikkeljaar";
            }
            else {
                tekst = "Februari heeft 28 dagen in " + jaartal + "" + " dus het is geen schrikkeljaar";
            }
            repaint();
                    }
                }
            }