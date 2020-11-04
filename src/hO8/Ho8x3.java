import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Ho8x3 extends Applet {
    TextField tekstvak;
    Label label;
    double bedrag;
    double btw;

    public void init() {

        label = new Label("Bereken BTW hier");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        add(label);
        btw = 1.21;
    }

    public void paint (Graphics g) {

        g.drawString("Het bedrag met 21% BTW   €"+bedrag * btw, 20, 90);
    }

class TekstvakListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        String s = tekstvak.getText();
        bedrag = Double.parseDouble(s);
        repaint();

    }
}
}
