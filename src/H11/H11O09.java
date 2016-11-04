package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H11O09  extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }

        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }

        y += 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }

        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }

        y += 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }

        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }

        y += 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
            }

        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
    }
}
