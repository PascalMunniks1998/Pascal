package H06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H06O02 extends Applet {
    int seconden;
    int uur;
    int dag;
    int jaar;
    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    @Override
    public void init() {
        seconden = 60;
        uur = 60;
        dag = 1440;
        jaar = 525600;
        uitkomst1 = seconden * uur;
        uitkomst2 = seconden * dag;
        uitkomst3 = seconden * jaar;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Aantal seconden in een uur:" + uitkomst1, 50, 60);
        g.drawString("Aantal seconden in een dag:" + uitkomst2, 50, 80);
        g.drawString("Aantal seconden in een jaar:" + uitkomst3, 50, 100);
    }
}
