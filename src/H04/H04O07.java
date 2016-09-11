package H04;

import java.applet.*;
import java.awt.*;

/**
 * Created by User on 11-09-16.
 */
public class H04O07 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRoundRect(50,50,100,100,50,50);
        g.setColor(Color.black);
        g.drawOval(70,70,15,15);
        g.fillOval(70,70,15,15);
        g.drawOval(70,110,15,15);
        g.fillOval(70,110,15,15);
        g.drawOval(110,70,15,15);
        g.fillOval(110,70,15,15);
        g.drawOval(110,110,15,15);
        g.fillOval(110,110,15,15);


    }
}
