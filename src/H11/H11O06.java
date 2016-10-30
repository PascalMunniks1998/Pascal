package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H11O06 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int cx = 150;
        int cy = 150;

        for(int i = 0; i < 5; i++) {
            int d1 = 30*i;
            int d2 = 30*i;
            int x1 = cx-d1;
            int y1 = cy-d2;
            int x2 = 2*d1;
            int y2 = 2*d2;
            g.drawOval(x1,y1,x2,y2);




        }
    }
}
