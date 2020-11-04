import java.awt.*;
import java.applet.*;

public class Ho11x5 extends Applet   {

    public void init(){
    }

    public void paint(Graphics g){

        int teller;
        int y = 0;

        for(teller = 0; teller < 5; teller++) {
            y += 20;
            g.drawRect(40, y, 305, y);
            g.drawString("" + teller, 310, y);
            teller++;
        }
    }
}
