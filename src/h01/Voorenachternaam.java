package h01;
import java.awt.*;
import java.applet.*;

public class Voorenachternaam extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Marten", 50, 60 );
    
    g.setColor(Color.red);
    g.drawString("Kalkman", 50, 70 );
}
}
