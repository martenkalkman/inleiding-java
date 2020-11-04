import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Ho10x1 extends Applet {

    int tekst;
    int getal;
    TextField tekstvak;
    Label label;



    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );


        label = new Label("Voer een getal in" );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString("Grootste getal:" + tekst,115,50 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if ( getal > tekst ) {
                tekst = getal;
                repaint();
            }
        }
    }
}



