package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H11O04 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 30;
        int z = 3;
        for (int i = 1; i <= 10; i ++) {
            g.drawString("" + i*z, x, y);
            x += 20;
        }
    }
}

