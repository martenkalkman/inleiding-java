import java.applet.Applet;
import java.awt.*;

public class Ho12x1 extends Applet {
    double nummer[];
    double nummer2[];
    double gemC;
    double getal;


    public void init() {
        nummer = new double[10];
        nummer2 = new double[10];

        for (int teller = 0; teller < nummer.length; teller++) {
            nummer[teller] = 100 * teller + 100;
            getal+= nummer[teller];
            gemC = getal/10;
        }

    }
    public void paint(Graphics g) {
        for (int teller = 0; teller < nummer.length; teller++) {
            g.drawString("" + nummer[teller], 30, 20 * teller + 20);
            g.drawString("Gemiddelde: " + gemC ,100,30);



        }
    }
}
