import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Ho10x3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een nummer van een maand in: ");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }



    public void paint(Graphics g) {
        g.drawString(tekst, 10, 45 );
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari, "+"aantal dagen: "+"31";
                    break;
                case 2:
                    tekst = "Februari, "+"aantal dagen: "+"28, " + " 29 als het schikkeljaar is.";
                    break;
                case 3:
                    tekst = "Maart, "+"aantal dagen: "+"30";
                    break;
                case 4:
                    tekst = "April, "+"aantal dagen: "+"31";
                    break;
                case 5:
                    tekst = "Mei, "+"aantal dagen: "+"30";
                    break;
                case 6:
                    tekst = "Juni, "+"aantal dagen: "+"31";
                    break;
                case 7:
                    tekst = "Juli, "+"aantal dagen: "+"30";
                    break;
                case 8:
                    tekst = "Augustus, "+"aantal dagen: "+"31";
                    break;
                case 9:
                    tekst = "September, "+"aantal dagen: "+"30";
                    break;
                case 10:
                    tekst = "October, "+"aantal dagen: "+"31";
                    break;
                case 11:
                    tekst = "November, "+"aantal dagen: "+"30";
                    break;
                case 12:
                    tekst = "December, "+"aantal dagen: "+"31";
                    break;
                default:
                    tekst = "Dit maandnummer bestaat niet ..!";
                    break;
            }
            repaint();
        }
    }
}