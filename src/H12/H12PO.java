package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H12PO extends Applet {
    int[] nummer;
    String[] naam;
    TextField[] tekstveld;
    int teller = 0;
    boolean klikOk;

    public void init() {
        tekstveld = new TextField[2];
        nummer = new int[10];
        Label label = new Label("Naam & Telefoonnummer");
        naam = new String[10];
        Button knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(label);
        for (int i = 0; i < tekstveld.length; i++) {
            tekstveld[i] = new TextField("", 10);
            tekstveld[i].addActionListener(kl);
            add(tekstveld[i]);
        }
        add(knop);
        setSize(600, 400);
    }

    private class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (teller < 10) {
                naam[teller] = tekstveld[0].getText();
                nummer[teller] = Integer.parseInt(tekstveld[1].getText());
                teller++;
            } else {
                klikOk = true;
                repaint();
            }
            tekstveld[0].setText("");
            tekstveld[1].setText("");
        }
    }

    public void paint(Graphics g) {
        if (klikOk) {
            int x = 90;
            int y = 50;
            for (int i = 0; i < nummer.length; i++) {
                g.drawString(naam[i] + "   " + nummer[i], x, y);
                y += 25;
            }
        }
    }
}
