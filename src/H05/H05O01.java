package H05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H05O01 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    @Override
    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(100,50,300,50);
        g.drawRect(100, 100, breedte, hoogte);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(530, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(530, 100, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(530, 225, hoogte, hoogte);
    }
}
