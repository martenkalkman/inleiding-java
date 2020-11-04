import java.awt.*;
import java.applet.*;

public class Ho11x1 extends Applet   {

    public void init(){
    }

        public void paint(Graphics g){

            int teller;
            int y = 0;

        for(teller = 0; teller < 20; teller++) {
                y += 20;
                g.drawLine(40, y, 305, y);
                g.drawString("" + teller, 310, y);
                teller++;
        }
    }
}
