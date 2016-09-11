package H04;

import java.applet.*;
import java.awt.*;

/**
 * Created by User on 11-09-16.
 */
public class H04O03 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(50,50,10,250);
        g.setColor(Color.red);
        g.drawRect(60,50,200,50);
        g.fillRect(60,50,200,50);
        g.setColor(Color.white);
        g.drawRect(60,100,200,50);
        g.fillRect(60,100,200,50);
        g.setColor(Color.blue);
        g.drawRect(60,150,200,50);
        g.fillRect(60,150,200,50);
    }
}
