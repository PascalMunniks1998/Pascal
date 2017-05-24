package H13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H13O02 extends Applet{
    public void init() {
        setSize(650, 400);

    }


    public void paint(Graphics g) {
        bakstenenMuur(g);
    }

    void bakstenenMuur(Graphics g) {
        int y, x, breedte, hoogte;
        x = 50;
        y = 50;
        breedte = 50;
        hoogte = 25;

        int breedte2=500;
        int hoogte2=250;

        g.setColor(Color.RED);
        g.fillRect(x, y+25, breedte2, hoogte2);

        for (int i = 0; i < 5; i++) {
            x = 50;
            y += 25;
            for (int kolom = 0; kolom < 10; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, breedte, hoogte);
                x += 50;
            }
            x = 25;
            y += 25;
            for (int kolom = 0; kolom < 11; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, breedte, hoogte);
                x += 50;
            }
        }
    }
}
