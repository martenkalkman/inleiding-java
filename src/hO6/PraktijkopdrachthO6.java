import java.awt.*;
import java.applet.*;

public class PraktijkopdrachthO6 extends Applet {
    double Getal1;
    double Getal2;
    double Getal3;
    double Gemiddeld;

    public void init() {
        Getal1 = 5.9;
        Getal2 = 6.3;
        Getal3 = 6.9;

        Gemiddeld = (Getal1 + Getal2 + Getal3) / 3;
        Gemiddeld*=10;
        Gemiddeld=(int)Gemiddeld;
        Gemiddeld/=10;
    }

    public void paint (Graphics g) {
        g.drawString("Het gemiddelde is: "+ Gemiddeld,60,60);
        g.drawRect(55,45, 160, 20);
    }
}
