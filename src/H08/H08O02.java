package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 23-09-16.
 */
public class H08O02 extends Applet {
    TextField tekstvak;
    Button knop;
    Label label;
    double 0;
;
    public void init() {
        label = new Label("Man");
        label = new Label("Vrouw");
        label = new Label("Jongen");
        label = new Label("Meisje");
        tekstvak = new TextField("0", 30);
        tekstvak = new TextField("0", 30);
        tekstvak = new TextField("0", 30);
        tekstvak = new TextField("0", 30);
        knop= new Button("+1");
        knop.addActionListener( new H08O02.KnopListener() );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {}

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.getText();
            repaint();
}
