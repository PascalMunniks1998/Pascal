package H02;

import java.applet.*;
import java.awt.*;

/**
 * Created by User on 09-09-16.
 */



//03/02/26

        public class H02 extends Applet {

        public void init() {
          setBackground(Color.blue);
        }
        public void paint(Graphics g) {
            g.setColor(Color.yellow);
            g.drawString("Hallo Pascal!!", 50, 60 );
        }
}
