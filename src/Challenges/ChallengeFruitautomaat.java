package Challenges;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

/**
 * Created by Pascal Munniks on 13-10-17.
 */
public class ChallengeFruitautomaat extends Applet {
    private Button knop;
    private Button koopknop;

    private Image afbeelding[] = new Image[20];
    private Image afbeelding1;
    private Image afbeelding2;
    private Image afbeelding3;

    private int punten;
    private String gewonnen;
    private String gewonnen1;

    private boolean gewonnentrue;
    private boolean gewonnentrue1;

    public void init() {
        knop = new Button("Speel");
        knop.addActionListener(new KnopListener());
        knop.setEnabled(true);
        add(knop);

        koopknop = new Button("Koop 10 Kredietpunten");
        koopknop.addActionListener(new KnopListener1());
        koopknop.setEnabled(false);
        add(koopknop);

        punten = 10;

        URL pad = ChallengeFruitautomaat.class.getResource("/Challenges/Images/");
        int teller = 0;
        for (int i = 0; i < 20; i++) {
            afbeelding[i] = getImage(pad, "fruit_" + teller + ".jpg");
            teller++;
        }
    }

    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int random1 = new Random().nextInt(20);
            int random2 = new Random().nextInt(20);
            int random3 = new Random().nextInt(20);


            afbeelding1 = afbeelding[random1];
            afbeelding2 = afbeelding[random2];
            afbeelding3 = afbeelding[random3];
            punten -= 1;

            if (punten == 0) {
                koopknop.setEnabled(true);
                knop.setEnabled(false);
            }

            if (random1 == random2 || random1 == random3 || random2 == random3) {
                punten += 4;
                gewonnen = "Gewonnen!! 4 krediet erbij";
                gewonnentrue = true;
            } else {
                gewonnen = "";
            }

            if (random1 == random2 && random1 == random3) {
                punten += 10;
                gewonnen1 = "Jackpot!! 10 krediet erbij";
                gewonnentrue1 = true;
            } else {
                gewonnen1 = "";
            }

            repaint();
        }
    }

    private class KnopListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            punten += 10;
            if (punten == 10) {
                knop.setEnabled(true);
                koopknop.setEnabled(false);
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawImage(afbeelding1, 90, 60, 71, 165, this);
        g.drawImage(afbeelding2, 163, 60, 71, 165, this);
        g.drawImage(afbeelding3, 236, 60, 71, 165, this);
        g.drawString("Krediet: " + punten, 90, 255);
        if (gewonnentrue) {
            g.drawString("" + gewonnen, 90, 275);
        } else if (gewonnentrue1) {
            g.drawString("" + gewonnen1, 90, 275);
        }
    }
}
