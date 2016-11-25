package H12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H12O02 extends Applet {

    Button[] buttons;

    @Override
    public void init() {
        buttons = new Button[25];
        for (int i = 0; i < buttons.length; i++) {
            Button bt = new Button();
            buttons[i] = bt;
            add(bt);
        }
    }
}
