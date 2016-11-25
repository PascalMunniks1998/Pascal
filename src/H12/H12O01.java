package H12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H12O01 extends Applet {

    int[] tabel;
    int gemiddelde;
    double uitkomst;

    @Override
    public void init() {
        tabel = new int[]{1, 5, 6, 8, 9, 4, 6, 7, 8, 7};
        gemiddelde = 0;
        for (int i = 0; i < tabel.length; i++) {
            gemiddelde = gemiddelde + tabel[i];
        }

        uitkomst = gemiddelde / tabel.length;

    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < tabel.length; i++) {
            g.drawString("" + tabel[i], 50, 20 * i + 20);
        }
        g.drawString("Gemiddelde is: "  + uitkomst, 50, 220);
    }
}
