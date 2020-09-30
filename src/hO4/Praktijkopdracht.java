import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //Lijn
        g.drawLine(10, 10, 230, 10);
        g.drawString("Lijn", 110, 25);

        //Rechthoek
        g.drawRect(10, 35, 220, 160);
        g.drawString("Rechthoek", 90, 207);

        //Afgeronde rechthoek
        g.drawRoundRect(10,210, 220, 160, 30, 20);
        g.drawString("Afgeronde rechthoek", 50, 382);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(245, 35, 220, 160);
        g.setColor(Color.black);
        g.drawOval(245, 35, 220,160);
        g.drawString("Gevulde rechthoek met ovaal", 280, 207);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(245,210, 220,160);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 310, 382);

        //Taartpunt met ovaal eromheen
        g.drawOval(480, 35, 220, 160);
        g.setColor(Color.magenta);
        g.fillArc(470, 35, 230, 160 , 0 ,45 );
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 505, 207);

        //Cirkel
        g.drawOval(510, 210, 160,160);
        g.drawString("Cirkel", 575, 382);
    }
}