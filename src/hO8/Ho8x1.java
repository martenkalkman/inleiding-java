import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Ho8x1 extends Applet {
    Button knop;
    String Schermtekst;
    TextField Tekstvak;


    public void init() {
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        knop = new Button("Reset");
        ResetListener k1 = new ResetListener();
        knop.addActionListener(k1);
        add(knop);
        Tekstvak = new TextField(14);
        Label label = new Label("Type iets in het tekstvak");
        add(Tekstvak);
        add(label);

    }
    public void paint(Graphics g) {
        g.drawString(Schermtekst, 20, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Schermtekst = Tekstvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Tekstvak.setText("");
            Schermtekst = Tekstvak.getText();
            repaint();
        }
    }
}

