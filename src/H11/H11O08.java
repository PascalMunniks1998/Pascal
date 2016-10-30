package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H11O08 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int cx = 450;
        int cy = 450;

        for(int i = 0; i < 100; i++) {
            int d1 = 4*i;
            int d2 = 4*i;
            int x1 = cx - d1;
            int y1 = cy - d2;
            int x2 = 2*d1;
            int y2 = 2*d2;
            g.drawOval(x1, y1, x2, y2);
        }
    }
}
