package H05;

import java.applet.*;
import java.awt.*;

/**
 * Created by User on 14-09-16.
 */
public class OefeningVariabelen extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
       a = 7;
       b = 8;
       c = 3;
       uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
       g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}

