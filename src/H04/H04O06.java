package H04;

import java.applet.*;
import java.awt.*;

/**
 * Created by User on 11-09-16.
 */
public class H04O06 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.darkGray);
        g.drawRoundRect(50,50,100,210,100,100);
        g.fillRoundRect(50,50,100,210,100,100);
        g.setColor(Color.red);
        g.drawOval(75,75,50,50);
        g.fillOval(75,75,50,50);
        g.setColor(Color.orange);
        g.drawOval(75,130,50,50);
        g.fillOval(75,130,50,50);
        g.setColor(Color.green);
        g.drawOval(75,185,50,50);
        g.fillOval(75,185,50,50);
    }
}
