import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int x[] = {150, 300, 225};
        int y[] = {150, 150, 50};
        g.drawPolygon(x, y, 3);
        g.drawRect(150, 150, 150,110);
        g.drawRect(160, 220, 25, 40);
        g.drawRect(200, 220, 50, 30);
        g.drawRect(230, 160, 50, 30);


    }
}
