package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12G extends Applet {

    int[] nummer;
    String[] naam;
    TextField[] Tekstvakken;
    int teller = 0;
    boolean gedrukt;



    @Override
    public void init() {
        // die [2] in de texfield is de hoeveelheid tekstfields ik vraag en bij de nummers wil ik 10 cijfers.
        Tekstvakken = new TextField[2];
        nummer = new int[10];

// die [10] is voor de hoeveelheid namen ik wil.
        naam = new String[10];
        Button knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);


// hier geef ik aan dat i kleiner is dan tekstvakken.length die 2 is. dan vraag ik voor tekstvakken die 10 groot zijn en dan voeg ik ze toe aan het applet met add().
        for (int i = 0; i < Tekstvakken.length; i++) {
            Tekstvakken[i] = new TextField("", 10);
            Tekstvakken[i].addActionListener(kl);
            add(Tekstvakken[i]);
        }
        //knop is hier pas gezet omdat het dan niet naar de voorkant van de tekstvakken gaat.
        add(knop);

    }

    //Deze class is zodat de knop werkt hier schijf ik de taak van de knop.
    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            if (teller < 10) {
// hier zet ik dat in de eerste tekstvak een naam moet en de tweede een nummer die teller is zodat ik naar de volgde kan want de teller plust.
                naam[teller] = Tekstvakken[0].getText();
                nummer[teller] = Integer.parseInt(Tekstvakken[1].getText());

                teller++;
            } else {
                //als gedrukt waar is dan moet de applet refreshen.
                gedrukt = true;
                repaint();
            }
            //hier zet ik de tekst als leeg zodat ik de user input kan krijgen.
            Tekstvakken[0].setText("");
            Tekstvakken[1].setText("");
        }
    }


    @Override
    public void paint(Graphics g) {
        //Hier is dat als je hebt gedrukt dus op de button dan moet de g.drawstring de naam + een spatie + de nummer op de coordinaties van x, y zetten die 50,50 zijn.
        //Die y += is de grote tussen alle namen en nummers.
        if (gedrukt) {
            int x = 50;
            int y = 50;
            for (int i = 0; i < nummer.length; i++) {
                g.drawString(naam[i] + "   " + nummer[i], x, y);
                y += 25;

            }

        }
    }
}