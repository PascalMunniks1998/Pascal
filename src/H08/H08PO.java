package H08;

import java.awt.event.ActionEvent;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;


/**
 * Created by User on 28-09-16.
 */
public class H08PO extends Applet {

    TextField input1;
    TextField input2;
    Button keerknop;
    Button deelknop;
    Button plusknop;
    Button minknop;
    double getal1;
    double getal2;

    public void init() {
        setSize(700, 200);

        input1 = new TextField("", 20);
        add(input1);
        input2 = new TextField("", 20);
        add(input2);
        keerknop = new Button("X");
        keerknop.addActionListener(new KeerKnopLuisteraar());
        add(keerknop);
        deelknop = new Button(":");
        deelknop.addActionListener(new DeelKnopLuisteraar());
        add(deelknop);
        plusknop = new Button("+");
        plusknop.addActionListener(new PlusKnopLuisteraar());
        add(plusknop);
        minknop = new Button("-");
        minknop.addActionListener(new MinKnopLuisteraar());
        add(minknop);
    }

    class KeerKnopLuisteraar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(input1.getText());
            getal2 = Double.parseDouble(input2.getText());
            double oplossing = getal1 * getal2;
            input1.setText("" + oplossing);
            input2.setText("");
        }
    }

    class DeelKnopLuisteraar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(input1.getText());
            getal2 = Double.parseDouble(input2.getText());
            double oplossing = getal1 / getal2;
            input1.setText("" + oplossing);
            input2.setText("");

        }
    }

    class PlusKnopLuisteraar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(input1.getText());
            getal2 = Double.parseDouble(input2.getText());
            double oplossing = getal1 + getal2;
            input1.setText("" + oplossing);
            input2.setText("");
        }
    }

    class MinKnopLuisteraar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(input1.getText());
            getal2 = Double.parseDouble(input2.getText());
            double oplossing = getal1 - getal2;
            input1.setText("" + oplossing);
            input2.setText("");
        }
    }
}