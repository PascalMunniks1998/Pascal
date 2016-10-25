package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 23-09-16.
 */
public class H08O02 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    Label label1;
    Label label2;
    Label label3;
    Label label4;
    double getal1;
    double getal2;

    public void init() {
        label1 = new Label("Man");
        label2 = new Label("Vrouw");
        label3 = new Label("Jongen");
        label4 = new Label("Meisje");
        getal1 = 0;
        getal2 = 1;
        tekstvak1 = new TextField("" + getal1, 10);
        tekstvak2 = new TextField("" + getal1, 10);
        tekstvak3 = new TextField("" + getal1, 10);
        tekstvak4 = new TextField("" + getal1, 10);
        knop1 = new Button("+1");
        knop2 = new Button("+1");
        knop3 = new Button("+1");
        knop4 = new Button("+1");
        knop1.addActionListener(new KnopListener1());
        knop2.addActionListener(new KnopListener2());
        knop3.addActionListener(new KnopListener3());
        knop4.addActionListener(new KnopListener4());
        add(label1);
        add(tekstvak1);
        add(label2);
        add(tekstvak2);
        add(label3);
        add(tekstvak3);
        add(label4);
        add(tekstvak4);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }


    class KnopListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak1.getText());
            double oplossing1 = getal1 + getal2;
            tekstvak1.setText("" + oplossing1);
        }
    }


    class KnopListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak2.getText());
            double oplossing1 = getal1 + getal2;
            tekstvak2.setText("" + oplossing1);
        }
    }

    class KnopListener3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak3.getText());
            double oplossing1 = getal1 + getal2;
            tekstvak3.setText("" + oplossing1);
        }
    }

    class KnopListener4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak4.getText());
            double oplossing1 = getal1 + getal2;
            tekstvak4.setText("" + oplossing1);
        }
    }
}