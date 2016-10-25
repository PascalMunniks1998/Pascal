package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 04-10-16.
 */
public class H10O01 extends Applet {

    TextField tekstveld;
    Button knop;
    int HoogsteGetal;
    int LaagsteGetal;
    boolean geklikt;

    @Override
    public void init() {
        geklikt = false;
        tekstveld = new TextField("", 10);
        add(tekstveld);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(knop);
        HoogsteGetal = Integer.MIN_VALUE;
        LaagsteGetal = Integer.MAX_VALUE;
    }

    @Override
    public void paint(Graphics g) {
        if (geklikt){
            g.drawString("Hoogste getal:" + HoogsteGetal, 50, 70);
            g.drawString("Laagste getal:" + LaagsteGetal, 50, 90);
        }

    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt = true;
            String getalString = tekstveld.getText();
            int getal = Integer.parseInt(getalString);
            if (getal > HoogsteGetal){
                HoogsteGetal = getal;
            }
            repaint();

            if (getal < LaagsteGetal){
                LaagsteGetal = getal;
            }
            repaint();
        }
    }
}
