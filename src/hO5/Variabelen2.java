package hO5;

import java.awt.*;
import java.applet.*;


public class Variabelen2 extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;
    int Ymax;
    public void init() {
        Valerie = 10*5;
        Jeroen = 20*5;
        Hans = 50*5;

        Ymax=600;

    }

    public void paint(Graphics g) {
        //Lijnen
        g.drawLine(60, 100, 250, 100);
        g.drawLine(60, 200, 250, 200);
        g.drawLine(60, 300, 250, 300);
        g.drawLine(60, 400, 250, 400);
        g.drawLine(60, 500, 250, 500);
        g.drawLine(60, 100, 60, 600);
        g.drawLine(250, 100, 250, 600);
        g.drawLine(60, 500, 250, 500);
        g.drawLine(60, 600, 250, 600);




        //Staven
        g.setColor(Color.red);
        g.fillRect(70,Ymax - Valerie, 30, Valerie);
        g.setColor(Color.blue);
        g.fillRect(140,Ymax - Jeroen, 30, Jeroen);
        g.setColor(Color.green);
        g.fillRect(210,Ymax - Hans, 30, Hans);

        //Namen
        g.setColor(Color.red);
        g.drawString("Valerie", 70, 620);g.setColor(Color.red);
        g.setColor(Color.blue);
        g.drawString("Jeroen", 140, 620);
        g.setColor(Color.green);
        g.drawString("Hans", 210, 620);

        //Gewicht
        g.setColor(Color.black);
        g.drawString("20KG", 25, 500);
        g.setColor(Color.black);
        g.drawString("40KG", 25, 400);
        g.setColor(Color.black);
        g.drawString("60KG", 25, 300);
        g.setColor(Color.black);
        g.drawString("80KG", 25, 200);
        g.setColor(Color.black);
        g.drawString("100KG", 25, 100);
    }
}



