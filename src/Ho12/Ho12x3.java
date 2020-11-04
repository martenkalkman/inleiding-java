import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Ho12x3 extends Applet {
    Button knop;
    TextField tv;
    TextField tv2;
    TextField tv3;
    TextField tv4;
    TextField tv5;
    double[] nummers;

    public void init() {
        nummers = new double[5];
        knop = new Button("Ok");
        knopListener kL = new knopListener();
        knop.addActionListener(kL);
        tv = new TextField("", 2);
        tv2 = new TextField("", 2);
        tv3 = new TextField("", 2);
        tv4 = new TextField("", 2);
        tv5 = new TextField("", 2);
        add(tv);
        add(tv2);
        add(tv3);
        add(tv4);
        add(tv5);
        add(knop);



    }

    public void paint(Graphics g) {

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nummers[0] = Double.parseDouble(tv.getText());
            nummers[1] = Double.parseDouble(tv2.getText());
            nummers[2] = Double.parseDouble(tv3.getText());
            nummers[3] = Double.parseDouble(tv4.getText());
            nummers[4] = Double.parseDouble(tv5.getText());
            Arrays.sort(nummers);
            tv.setText(""+nummers[0]);
            tv2.setText(""+nummers[1]);
            tv3.setText(""+nummers[2]);
            tv4.setText(""+nummers[3]);
            tv5.setText(""+nummers[4]);
        }
    }
}
