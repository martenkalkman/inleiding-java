package hO6;
import java.awt.*;
import java.applet.*;


public class Rekenen1 extends Applet {

    double a, b, Uitkomst;



    public void init() {
        a = 113;
        b = 4;
        Uitkomst = a / b;
    }

    public void paint (Graphics g) {

        g.drawString("Marten zijn deel: €" + Uitkomst, 100, 90);
    g.drawString("Jan zijn deel: €" + Uitkomst, 100, 110);
    g.drawString("Ali zijn deel: €" + Uitkomst, 100, 130);
    g.drawString("Jeanette haar deel: €" + Uitkomst, 100, 150);
    g.drawRect(55, 50, 220, 140);

        }
}

