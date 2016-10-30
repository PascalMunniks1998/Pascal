package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H11O05 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller;
        int x1 = 25;
        int y1 = 25;
        int x2 = 25;
        int y2 = 25;
        for (teller = 0; teller < 5; teller ++) {
            x1 += 25;
            y1 += 25;
            g.drawRect(x1, y1, x2, y2);
        }
    }
}
