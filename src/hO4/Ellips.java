import java.awt.*;
import java.applet.*;

public class Ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
g.fillArc(20,20, 200, 130, 0, 360);
    }
}
