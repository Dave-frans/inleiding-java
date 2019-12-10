package h11;

import java.awt.*;
import java.applet.*;


public class H11D extends Applet {

    public void init() {}

    public void paint(Graphics g){
        //count is voor de spatie tussen de cijfers.
        // in de loop staat dat het niet groter dan 10 gaat. int a = i*3 die i is vanaf 1 t/m 10 dus 1 *3 2*3 enzov.
        int count = 20;
        for(int i=1; i<=10; i++){
            int a = i*3;
            g.drawString(i  +" * 3 ="+ a,150,count);
            count = count+20;

        }
    }
}