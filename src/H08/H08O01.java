package H08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by User on 23-09-16.
 */
public class H08O01 extends Applet{
    TextField tekstvak;
    Button knop1;
    Button knop2;
    Label label;

    public void init() {
        label = new Label("Type iets in het tekstvakje");
        tekstvak = new TextField("Klik op Mij", 30);
        knop1 = new Button("Ok");
        knop2 = new Button("Reset");
        knop1.addActionListener( new KnopListener1() );
        knop2.addActionListener( new KnopListener2() );
        add(tekstvak);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {}

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.getText();
            repaint();
        }

    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }

    }
}

