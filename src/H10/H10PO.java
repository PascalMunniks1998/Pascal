package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H10PO extends Applet {
    TextField tekstvak1;
    String s1, tekst;
    int getal;

    @Override
    public void init() {
        tekstvak1 = new TextField("", 20);
        tekstvak1.addActionListener(new TekstvakListener());
        tekst = "";
        add(tekstvak1);
    }


    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100);
    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak1.getText();
            getal = Integer.parseInt(s1);
            switch(getal) {
                case 1:
                    tekst = "Je hebt een slecht";
                    break;
                case 2:
                    tekst = "Je hebt een slecht";
                    break;
                case 3:
                    tekst = "Je hebt een slecht";
                    break;
                case 4:
                    tekst = "Je hebt een onvoldoende";
                    break;
                case 5:
                    tekst = "Je hebt een matig";
                    break;
                case 6:
                    tekst = "Je hebt een voldoende";
                    break;
                case 7:
                    tekst = "Je hebt een voldoende";
                    break;
                case 8:
                    tekst = "Je hebt een goed";
                    break;
                case 9:
                    tekst = "Je hebt een goed";
                    break;
                case 10:
                    tekst = "Je hebt een goed";
                    break;
                default:
                    tekst = "Je hebt een verkeerd cijfer ingetikt";
                    break;
            }
            repaint();
        }
    }
}
