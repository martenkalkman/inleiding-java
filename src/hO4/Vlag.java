package hO4;

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(100, 50, 250, 50);
        g.setColor(Color.white);
        g.fillRect(100, 100, 250, 50);
        g.setColor(Color.blue);
        g.fillRect(100, 150, 250, 50);
        g.setColor(Color.black);
        g.fillRect(100, 50, 10, 500);
    }
}
