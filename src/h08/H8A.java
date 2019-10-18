import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8A extends Applet {
    TextField tekstvak;
    Button knop, knop2;
    String s;
    Label label;

    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("Ok");
        knop2 = new Button("Reset");
        knop.addActionListener(new KnopListener2());
        knop2.addActionListener(new KnopListener());
        label = new Label("Type iets hier");
        add(label);
        add(tekstvak);
        add(knop);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 80);


    }


    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}