package H13;

import java.applet.Applet;
import java.awt.*;

public class H13PO extends Applet {

    @Override
    public void init() {

    }

    public void paint (Graphics g) {
        boom(g);
    }

    void boom(Graphics g) {
        int x;
        int y;
        y = 50;
        for (int i = 0; i < 3; i++) {
            x = 50;
            y += 50;
            for (int boom = 0; boom < 6; boom++){
                g.setColor(new Color(167, 95, 61));
                g.fillRect(x+50,y+75, 50, 100);
                g.setColor(Color.green);
                g.fillOval(x+25, y+50, 100, 50);
                g.setColor(Color.green);
                g.fillOval(x, y+25, 100, 50);
                g.setColor(Color.green);
                g.fillOval(x+50, y+25, 100, 50);
                g.setColor(Color.green);
                g.fillOval(x+25,y, 100, 50);
                x += 150;
            }
            y += 150;
        }
    }
}
