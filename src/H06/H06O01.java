package H06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H06O01 extends Applet {
    double getal;
    double bedrag;
    double uitkomst;

    @Override
    public void init() {
        getal = 4;
        bedrag = 113;
        uitkomst = bedrag/getal;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Jan:" + uitkomst, 50, 60);
        g.drawString("Ali:" + uitkomst, 50, 80);
        g.drawString("Jeannette:" + uitkomst, 50, 100);
        g.drawString("Pascal:" + uitkomst, 50, 120);
    }
}
