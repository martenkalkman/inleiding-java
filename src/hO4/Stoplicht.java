import java.applet.*;
import java.awt.*;

public class Stoplicht extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(200, 160, 20, 500);
        g.setColor(Color.black);
        g.fillOval(185, 175, 50,50);
        g.setColor(Color.darkGray);
        g.fillOval(150, 150, 120, 200);
        g.setColor(Color.gray);
        g.fillRect(180, 180, 60, 150);
        g.setColor(Color.black);
        g.fillOval(185, 175, 50,50);
        g.setColor(Color.red);
        g.fillOval(185, 180, 50, 50);
        g.setColor(Color.black);
        g.fillOval(185, 225, 50,50);
        g.setColor(Color.orange);
        g.fillOval(185, 230, 50, 50);
        g.setColor(Color.black);
        g.fillOval(185, 275, 50,50);
        g.setColor(Color.green);
        g.fillOval(185, 280, 50, 50);

    }
}
