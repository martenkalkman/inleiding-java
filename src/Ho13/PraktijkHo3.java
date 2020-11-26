import java.applet.Applet;
import java.awt.*;

public class PraktijkHo3 extends Applet{

    int x;
    int y;

    public void init() {

        setSize(1000, 500);

    }

    public void paint(Graphics g) {
        x = 150;
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 5; b++) {
                tekenstam(g, x, y, 35, 80);

                x += 150;
            }
            x = 150;
            y += 200;
        }
    }

    void tekenstam(Graphics g, int x2, int y2, int width, int height) {

        g.setColor(Color.orange);
        g.fillRect( x2, y2 + height, width, height);
        g.setColor(Color.green);
        g.fillOval(x2 - width, y2, width * 3, height);

    }
}
