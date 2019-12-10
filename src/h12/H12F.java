package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12F extends Applet {
    //Ik heb hier int gebruikt voor gehele getallen.
    int[] cijfers = {100, 100, 300, 300, 300, 500, 400, 500, 700, 700, 700, 700, 800, 1000, 600};

    TextField Tekstvak;
    Button Knop;
    String s;

    public void init() {
        //Hier voeg ik de tekstvak toe en de knop.
        Tekstvak = new TextField("", 10);
        add(Tekstvak);
        Knop = new Button("OK");
        Knop.addActionListener(new knoplistener());
        add(Knop);
        s = "";

    }

    public void paint(Graphics g) {
        // Hier gebruik ik g.drawString om mijn tekst op scherm te zetten.
        g.drawString(s, 20, 80);
        g.drawString("Vul u getal in ", 35, 20);


    }

    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
// Integer.parseInt is zodat wat je in de tekstvak vult in dit geval is het een cijfer een geheel getal. Daarom werkt het alleen als je cijfers in vult letter geven een error.
            int invoer = Integer.parseInt(Tekstvak.getText());

            boolean gevonden = false;
            int teller = 0;

// Hier is de opdracht invoer is zoals ik al zegt hebt een cijfer dus als cijfers en invoer het zelfde zijn moet de teller plus 1 tellen en als de waarde die in gevult is gevonden dan doet de gevonden true en zegt tegen de if statement om de eerste optie te kiezen.
            for (int i = 0; i < cijfers.length; i++) {
                if (cijfers[i] == invoer) {
                    teller++;
                    gevonden = true;


                }

            }
            // Hier is de opdracht dat wanneer het gevonden is geeft je de eerste optie hier als antwoord en als het niet gevonden is de tweede optie.
            if (gevonden) {

                s = "De waarde die u ingevoerd heeft is gevonden en komt " + teller + " keer voor ";
            } else {
                s = "De waarde die u ingevoerd heeft is niet gevonden";
            }
// repaint is om te refreshen.
            repaint();
        }
    }


}