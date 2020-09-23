import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        //Lijnen
        g.drawLine(60, 100, 250, 100);
        g.drawLine(60, 150, 250, 150);
        g.drawLine(60, 200, 250, 200);
        g.drawLine(60, 250, 250, 250);
        g.drawLine(60, 300, 250, 300);
        g.drawLine(60, 100, 60, 300);
        g.drawLine(250, 100, 250, 300);

        //Staven
        g.setColor(Color.red);
                g.fillRect(70,250, 30, 50);
        g.setColor(Color.blue);
        g.fillRect(140,100, 30, 200);
        g.setColor(Color.green);
        g.fillRect(210,150, 30, 150);

        //Namen
        g.setColor(Color.red);
        g.drawString("Valerie", 70, 320);g.setColor(Color.red);
        g.setColor(Color.blue);
        g.drawString("Jeroen", 140, 320);
        g.setColor(Color.green);
        g.drawString("Hans", 210, 320);

        //Gewicht
        g.setColor(Color.black);
        g.drawString("20KG", 25, 300);
        g.setColor(Color.black);
        g.drawString("40KG", 25, 250);
        g.setColor(Color.black);
        g.drawString("60KG", 25, 200);
        g.setColor(Color.black);
        g.drawString("80KG", 25, 150);
        g.setColor(Color.black);
        g.drawString("100KG", 25, 100);
    }
}
