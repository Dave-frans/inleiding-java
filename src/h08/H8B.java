import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8B extends Applet {
    TextField tekstvak, tekstvak2, tekstvak3, tekstvak4;
    Button knop, knop2, knop3, knop4, knop5;
    Label label;
    int getal1 = 0;
    int getal2 = 0;
    int resultaat;







    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak2 = new TextField("", 5);
        tekstvak3 = new TextField("", 5);
        tekstvak4 = new TextField("", 5);
        knop = new Button("Mannen");
        knop2 = new Button("Vrouwen");
        knop3 = new Button("Mannelijke leerlingen");
        knop4 = new Button("Vrouwelijke leerlingen");
        knop5 = new Button("Allemaal tegelijk");
        knop.addActionListener(new KnopListener2());
        knop2.addActionListener(new KnopListener());
        knop3.addActionListener(new knopListener3());
        knop4.addActionListener(new knopListener4());
        knop5.addActionListener(new knopListener5());
        label = new Label("");
        add(label);
        add(tekstvak);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        add(knop5);

    }

    public void paint(Graphics g) {



    }


    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = ++getal1;
            tekstvak2.setText("" + resultaat);
            repaint();
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = ++getal1;
            tekstvak.setText("" + resultaat);
            repaint();
        }
    }

    private class knopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = ++getal1;
            tekstvak3.setText("" + resultaat);
            repaint();
        }
    }

    private class knopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = ++getal1;
            tekstvak4.setText("" + resultaat);
            repaint();
        }
    }

    private class knopListener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = ++getal1;
            tekstvak4.setText("" + resultaat);
            tekstvak3.setText("" + resultaat);
            tekstvak2.setText("" + resultaat);
            tekstvak.setText("" + resultaat);

            repaint();
        }
    }
}