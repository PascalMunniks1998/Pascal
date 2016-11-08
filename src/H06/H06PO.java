package H06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H06PO extends Applet{
    double cijfer1;
    double cijfer2;
    double cijfer3;
    int deelcijer;
    int gemiddelde;

    @Override
    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        deelcijer = 3;
        gemiddelde = (int) (cijfer1 + cijfer2 + cijfer3) / deelcijer;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Gemiddelde: " + gemiddelde, 50, 60);
    }
}
