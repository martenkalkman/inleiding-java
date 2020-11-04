import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Ho8xPraktijk extends Applet {
    TextField tekstvak;
    TextField Tekstvak;
    double getal;


    public void init() {

        Button knopPL = new Button("+");
        knopPListener PL = new knopPListener();
        knopPL.addActionListener(PL);
        add(knopPL);

        Button knopMN = new Button("-");
        knopMListener ML = new knopMListener();
        knopMN.addActionListener(ML);
        add(knopMN);

        Button knopKR = new Button("*");
        knopKListener KL = new knopKListener();
        knopKR.addActionListener(KL);
        add(knopKR);

        Button knopDL = new Button("/");
        knopDListener DL = new knopDListener();
        knopDL.addActionListener(DL);
        add(knopDL);


        tekstvak = new TextField("",10);
        add(tekstvak);
        Tekstvak = new TextField("",10);
        add(Tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("",20,80);

    }

    class knopPListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2  = Double.parseDouble(Tekstvak.getText());
            getal = (vak1+vak2);
            tekstvak.setText(""+getal);
            Tekstvak.setText("");
            repaint();

        }

    }

    class knopMListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2 = Double.parseDouble(Tekstvak.getText());
            getal = (vak1 - vak2);
            tekstvak.setText("" + getal);
            Tekstvak.setText("");
            repaint();

        }
    }

    class knopKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2  = Double.parseDouble(Tekstvak.getText());
            getal = (vak1*vak2);
            tekstvak.setText(""+getal);
            Tekstvak.setText("");
            repaint();

        }
    }

    class knopDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2  = Double.parseDouble(Tekstvak.getText());
            getal = (vak1/vak2);
            tekstvak.setText(""+getal);
            Tekstvak.setText("");
            repaint();


        }
    }

}
