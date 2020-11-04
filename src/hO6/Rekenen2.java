package hO6;


import java.awt.*;
import java.applet.*;

public class Rekenen2 extends Applet {
    int a, Uur, Dag, Jaar, uitkomst1, uitkomst2, uitkomst3;

    public void init() {
        a = 3600;
        Uur = (1 * 60) * 60;
        Dag = (1 * Uur) * 24;
        Jaar = (1* Dag) * 365;
        uitkomst1 =  Uur;
        uitkomst2 = Dag;
        uitkomst3 = Jaar;

    }
    public void paint(Graphics g) {
        g.drawString("In een uur =    " + uitkomst1, 90, 100);
        g.drawString("In een dag =    " + uitkomst2, 90, 120);
        g.drawString("In een jaar =   " + uitkomst3, 90, 140);
        g.drawRect(80, 50, 150, 150);
    }
}
