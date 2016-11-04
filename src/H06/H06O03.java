package H06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H06O03 extends Applet {
    int getal1;
    int getal2;
    int uitkomst;

    @Override
    public void init() {
        getal1 = 5;
        getal2 = 7;
        uitkomst = getal1 +- getal2;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("De uitkomst is:" + uitkomst, 50, 60);
    }
}
