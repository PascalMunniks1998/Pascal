package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ${PascalMunniks} on ${12-10-16).
 */
public class H10O03 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Label label1;
    Label label2;
    String s1, s2, tekst;
    int maand;
    int jaartal;

    @Override
    public void init() {
        tekstvak1 = new TextField("", 20);
        label1 = new Label("Type het maandnummer in");
        tekstvak2 = new TextField("", 20);
        label2 = new Label("Type het jaartal in");
        tekstvak1.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label1);
        add(tekstvak1);
        add(label2);
        add(tekstvak2);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100 );
    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak1.getText();
            maand = Integer.parseInt( s1);
            s2 = tekstvak2.getText();
            jaartal = Integer.parseInt(s2);
            switch(maand) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
                    break;
                case 2:
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        tekst = "Februari heeft 29 dagen";
                    } else {
                        tekst = "Februari heeft 28 dagen";
                    }
                    break;
                case 3:
                    tekst = "Maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus heeft 31 dagen";
                    break;
                case 9:
                    tekst = "September heeft 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "November heeft 30 dagen";
                    break;
                case 12:
                    tekst = "December heeft 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt!";
                    break;
            }
            repaint();
        }
    }
}
