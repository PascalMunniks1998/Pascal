package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H11O02 extends Applet {


    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller;
        int y = 0;
        for(teller = 10; teller <= 20; teller++) {
            y += 20;
            g.drawString("" + teller,50, y);

        }
    }
}
