import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Ho10x2 extends Applet {

    TextField tekst;
    boolean firstnumber;
    Label label;
    int maxInput;
    int userInput;
    int minInput;

    public void init() {
        tekst = new TextField("",7);
        tekst.addActionListener((new vakListener()));
        label = new Label("Voer een getal in: ");
        add(label);
        add(tekst);
        maxInput = 0;
        minInput = 0;
        firstnumber = true;

    }


    public void paint(Graphics g) {
        g.drawString("Min input: " + minInput,120,70);
        g.drawString("Max input: "+ maxInput, 120,90);

    }


    class vakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInputString = tekst.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstnumber) {
                firstnumber = false;
                maxInput = userInput;
                minInput = userInput;
                repaint();
            } else {
                if (userInput > maxInput) {
                    maxInput = userInput;

                    repaint();
                }else if (userInput < minInput) {
                    minInput = userInput;

                    repaint();
                }
            }
        }
    }
}