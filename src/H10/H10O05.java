package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H10O05 extends Applet {
    int cijfer;
    int teller;
    TextField tekstvak;
    String s, tekst;
    Button knop;
    boolean geklikt;

    @Override
    public void init() {
        geklikt = false;
        tekstvak = new TextField("" , 20);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add (tekstvak);
        add (knop);
    }

    @Override
    public void paint(Graphics g) {
        teller++;
        if (geklikt) {
            g.drawString(tekst, 50, 80);
        }
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt = true;
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if (cijfer >= 6) {
                tekst = "Je hebt een voldoende ";
                repaint();
            } else {
                tekst = "Je hebt een onvoldoende ";
                repaint();
            }
        }
    }
}
