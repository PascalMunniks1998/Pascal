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
        breedte = 500;
        hoogte = 250;

        int breedte2=50;
        int hoogte2=25;

        g.setColor(Color.RED);
        g.fillRect(x, y+25, breedte, hoogte);

        for (int i = 0; i < 5; i++) {
            x = 50;
            y += 25;
            for (int kolom = 0; kolom < 10; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, breedte2, hoogte2);
                x += 50;
            }
            x = 25;
            y += 25;
            for (int kolom = 0; kolom < 11; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, breedte2, hoogte2);
                x += 50;
            }
        }
    }
}
