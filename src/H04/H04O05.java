package H04;

import java.applet.*;
import java.awt.*;

/**
 * Created by User on 11-09-16.
 */
public class H04O05 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawArc(50,50,200,100,90,360);
        g.fillArc(50,50,200,100,90,360);
    }
}
