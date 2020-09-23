package hO4;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(150, 150, 100, 100, 50, 50);
        g.setColor(Color.black);
        g.fillOval(160, 160, 20,20);
        g.setColor(Color.black);
        g.fillOval(160, 220, 20,20);
        g.setColor(Color.black);
        g.fillOval(220, 220, 20,20);
        g.setColor(Color.black);
        g.fillOval(220, 160, 20,20);
    }
}
