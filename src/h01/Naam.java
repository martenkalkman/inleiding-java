package h01;
import java.awt.*;
        import java.applet.*;

public class Naam extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Marten", 50, 60 );
    }
}