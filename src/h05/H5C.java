package h05;

import java.applet.Applet;
import java.awt.*;

public class H5C extends Applet {
    int valerie;
    int jeroen;
    int hans;
    int breedteScherm;
    int hoogteScherm;
    int margeH;
    int margeV;
    int hoogteYas;
    int maxGewicht;
    int aantalStrepen;
    int breedteStaaf;

    public void init() {
        breedteScherm = 500;
        hoogteScherm = 400;
        this.setSize(breedteScherm, hoogteScherm);
        margeH = breedteScherm / 10;
        margeV = hoogteScherm / 10;
        hoogteYas = hoogteScherm - margeH * 2;
        breedteStaaf = margeH;
        hans = 80;
        jeroen = 100;
        valerie = 40;
        maxGewicht = 200;
        aantalStrepen = 10;


    }

    public void paint(Graphics g) {
        breedteScherm = this.getWidth();
        hoogteScherm = this.getHeight();
        margeH = breedteScherm / 10;
        margeV = hoogteScherm / 10;
        hoogteYas = hoogteScherm - margeH * 2;
        breedteStaaf = margeH;


        int x = margeH;
        int y = hoogteScherm - margeV;
        int x2 = breedteScherm - margeH;
        int y2 = y;
        g.drawLine(x, y, x2, y2);


        y2 = margeV;
        x2 = x;
        g.drawLine(x, y, x2, y2);


        int breedteStreep = 5;
        x -= breedteStreep;
        g.drawLine(x, y, x + breedteStreep, y);
        y -= hoogteYas / aantalStrepen;
        g.drawLine(x, y, x + breedteStreep, y);
        y -= hoogteYas / aantalStrepen;
        g.drawLine(x, y, x + breedteStreep, y);
        y -= hoogteYas / aantalStrepen;
        g.drawLine(x, y, x + breedteStreep, y);
        y -= hoogteYas / aantalStrepen;
        g.drawLine(x, y, x + breedteStreep, y);
        y -= hoogteYas / aantalStrepen;
        g.drawLine(x, y, x + breedteStreep, y);
        y -= hoogteYas / aantalStrepen;
        g.drawLine(x, y, x + breedteStreep, y);
        y -= hoogteYas / aantalStrepen;


        g.setColor(Color.blue);
        x = margeH * 2;
        y = hoogteScherm - margeV;
        y -= (hoogteYas / maxGewicht) * valerie;
        int height = (hoogteYas / maxGewicht) * valerie;
        g.fillRect(x, y, breedteStaaf, height);
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 105, 375);


        g.setColor(Color.YELLOW);
        x += margeH + breedteStaaf;
        y = hoogteScherm - margeV;
        y -= (hoogteYas / maxGewicht) * jeroen;
        height = (hoogteYas / maxGewicht) * jeroen;
        g.fillRect(x, y, breedteStaaf, height);
        g.setColor(Color.black);
        g.drawString("jeroen", 205, 375);


        g.setColor(Color.red);
        x += margeH + breedteStaaf;
        y = hoogteScherm - margeV;
        y -= (hoogteYas / maxGewicht) * hans;
        height = (hoogteYas / maxGewicht) * hans;
        g.fillRect(x, y, breedteStaaf, height);
        g.setColor(Color.black);
        g.drawString("hans", 305, 375);


    }
}

