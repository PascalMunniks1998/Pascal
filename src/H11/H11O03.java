package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H11O03 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 30;
        int z = 1;
        for (int i = 1; i < 30; i += z)  {
            g.drawString("" + i, x, y);
            x += 20;
            z++;
        }
    }
}
