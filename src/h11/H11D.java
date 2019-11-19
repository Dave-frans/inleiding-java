package h11;

import java.awt.*;
import java.applet.*;


public class H11D extends Applet {

    public void init() {}

    public void paint(Graphics g){
        int count = 20;
        for(int i=1; i<=10; i++){
            int a = i*3;
            g.drawString(i  +" * 3 ="+ a,150,count);
            count = count+20;
        }
    }
}