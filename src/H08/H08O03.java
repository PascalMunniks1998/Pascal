package H08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 30-09-16.
 */
public class H08O03 extends Applet{
    TextField tekstvak;
    Button knop1;
    double getal1;
    double getal2;
    double belasting;

    public void init() {
        getal2 = 1.21;
        tekstvak = new TextField("", 30);
        knop1 = new Button("Incl Btw");
        knop1.addActionListener(new KnopListener1());
        add(tekstvak);
        add(knop1);
    }

    class KnopListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak.getText());
            belasting = getal1 + getal2;
            tekstvak.setText("" + belasting);
        }

    }
}

