import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ho12x4 extends Applet {
    TextField tekstvak;
    Button knop;
    boolean gevonden;
    double[] nummers = {1,2,3,4,5,6,7,8,9,10};
    int gezocht;
    double index;
    String tekst;

    public void init() {
        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        tekstvak = new TextField("", 8);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;
        while (teller < nummers.length) {
            y += 20;
            g.drawString("" + nummers[teller], 50, y);
            teller++;

            if (gevonden == true) {
                g.drawString("De waarde is gevonden", 80, 100);
                g.drawString("De index is: " + tekst, 80, 110);
            } else {
                g.drawString("De waarde is niet gevonden.", 80, 100);
            }


        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gezocht = Integer.parseInt(tekstvak.getText());
            tekstvak.setText("");
            gevonden = false;
            int teller = 0;
            while (teller < nummers.length) {
                if (nummers[teller] == gezocht) {
                    gevonden = true;
                    break;
                }
                teller++;
                repaint();
            }
            String s = tekstvak.getText();
            switch(gezocht) {
                case 1:
                    tekst = "0";
                    break;
                case 2:
                    tekst = "1";
                    break;
                case 3:
                    tekst = "2";
                    break;
                case 4:
                    tekst = "3";
                    break;
                case 5:
                    tekst = "4";
                    break;
                case 6:
                    tekst = "5";
                    break;
                case 7:
                    tekst = "6";
                    break;
                case 8:
                    tekst = "7";
                    break;
                case 9:
                    tekst = "8";
                    break;
                case 10:
                    tekst = "9";
                    break;
                default:
                    break;
            }
            repaint();
        }
    }
}
