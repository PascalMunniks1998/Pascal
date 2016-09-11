package H04;

import java.applet.*;
import java.awt.*;

/**
 * Created by User on 11-09-16.
 */
public class H04O04 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(50,120,25,40);
        g.fillRect(50,120,25,40);
        g.drawString("Valerie", 50, 175);
        g.setColor(Color.blue);
        g.drawRect(90,60,25,100);
        g.fillRect(90,60,25,100);
        g.drawString("Jeroen", 90, 175);
        g.setColor(Color.green);
        g.drawRect(130,80,25,80);
        g.fillRect(130,80,25,80);
        g.drawString("Hans", 130, 175);
    }
}
