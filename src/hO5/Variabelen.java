import sun.java2d.SunGraphics2D;

import java.awt.*;
import java.applet.*;

public class Variabelen extends Applet {
    Color magenta;
    Color black;
    int hoogte;
    int breedte;

    public void init() {
        magenta = Color.magenta;
        black = Color.black;
        hoogte = 100;
        breedte = 210;
    }

    public void paint(Graphics g){



        g.drawLine(10, 10, 230, 10);
        g.drawString("Lijn", 110, 25);
        g.drawRect(10, 35, 220, 160);
        g.drawString("Rechthoek", 90, 207);
        g.drawRoundRect(10, 210, 220, 160, 30, 20);
        g.drawString("Afgeronde rechthoek", 50, 382);
        g.setColor(Color.magenta);
        g.fillRect(245, 35, 220, 160);
        g.setColor(Color.black);
        g.drawOval(245, 35, 220, 160);
        g.drawString("Gevulde rechthoek met ovaal", 280, 207);
        g.setColor(Color.magenta);
        g.fillOval(245, 210, 220, 160);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 310, 382);
        g.drawOval(480, 35, 220, 160);
        g.setColor(Color.magenta);
        g.fillArc(470, 35, 230, 160, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 505, 207);
        g.drawOval(510, 210, 160, 160);
        g.drawString("Cirkel", 575, 382);
    }
}

