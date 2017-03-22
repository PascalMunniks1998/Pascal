package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H12O05 extends Applet {

    int[] tabel = {10, 20, 40, 80, 160, 320, 640, 1280, 2560, 5120};
    TextField zoeken;
    Button knop;
    String schermtekst;

    @Override
    public void init() {
        zoeken = new TextField("", 25);
        zoeken.addActionListener(new KnopListner());
        add(zoeken);
        knop = new Button("OK");
        knop.addActionListener(new KnopListner());
        add(knop);
        schermtekst = "";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 70);
    }

    class KnopListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(zoeken.getText());
            boolean gevonden = false;
            int index = 0;
            for(int i = 0; i < tabel.length; i++) {
                if (tabel[i]==invoer){
                    gevonden = true;
                    index = i;
                }
            }
            if (gevonden) {
                schermtekst = "Waarde gevonden. Index is " + index;
            }
            else {
                schermtekst = "Waarde niet gevonden";
            }
            repaint();
        }
    }
}
