package H04;

import java.applet.*;
import java.awt.*;

/**
 * Created by User on 11-09-16.
 */
public class H04O02 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(50,100,100,50);
        g.drawLine(100,50,150,100);
        g.drawLine(50,100,150,100);
        g.drawRect(50,100,100,100);
        g.drawRect(60,130,35,35);
        g.drawRect(100,110,50,90);
    }
}
