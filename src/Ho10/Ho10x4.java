import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ho10x4 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Label label2;
    String s, tekst, tekst2, tekst3;
    int jaartal;
    int maand;

    public void init() {


        tekstvak = new TextField("", 5);
        label = new Label("Type een jaartal: ");
        tekstvak.addActionListener(new JaarListener());
        add(label);
        add(tekstvak);

        tekstvak2 = new TextField("", 5);
        label2 = new Label("Type een nummer van een maand in: ");
        tekstvak2.addActionListener(new TekstvakListener());
        add(label2);
        add(tekstvak2);
    }


    public void paint(Graphics g) {

        g.drawString("Het jaartal is:                " + tekst, 10, 50);
        g.drawString("De maand is:           " + tekst2, 10, 60);
        g.drawString("De Aantal dagen zijn:           " + tekst3, 10, 70);
    }



    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak2.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst2 = "Januari";
                    tekst3 = "31";
                    break;
                case 2:
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0) {
                        tekst3 = "29";
                        tekst2 = "Februari";
                    } else {
                        tekst3 = "28";
                        tekst2 = "Februari";
                    }
                    break;
                case 3:
                    tekst2 = "Maart";
                    tekst3 = "30";
                    break;
                case 4:
                    tekst2 = "April";
                    tekst3 = "31";
                    break;
                case 5:
                    tekst2 = "Mei";
                    tekst3 = "30";
                    break;
                case 6:
                    tekst2 = "Juni";
                    tekst3 = "31";
                    break;
                case 7:
                    tekst2 = "Juli";
                    tekst3 = "30";
                    break;
                case 8:
                    tekst2 = "Augustus";
                    tekst3 = "31";
                    break;
                case 9:
                    tekst2 = "September";
                    tekst3 = "30";
                    break;
                case 10:
                    tekst2 = "October";
                    tekst3 = "31";
                    break;
                case 11:
                    tekst2 = "November";
                    tekst3 = "30";
                    break;
                case 12:
                    tekst2 = "December";
                    tekst3 = "31";
                    break;
                default:
                    tekst2 = "Dit maandnummer bestaat niet ..!";
                    break;
            }
            repaint();
        }
    }


    class JaarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
