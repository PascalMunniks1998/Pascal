package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class H14O02 extends Applet{

    //kaarten
    private String[] typen = {"klaver", "schoppen", "harten", "ruiten"};
    private String[] kaarten = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer"};
    private String[] deck = new String[52];

    //spelers
    private String[] speler1 = new String[13];
    private String[] speler2 = new String[13];
    private String[] speler3 = new String[13];
    private String[] speler4 = new String[14];

    //overige
    private Button knop;
    int k;

    boolean geklikt;

    public void init() {
        knop = new Button("Deel kaart");
        knop.addActionListener(new KnopListener());
        add(knop);

        int index = 0;
        for (int i = 0; i < typen.length; i++) {
            String soort = typen[i];
            for (int j = 0; j < kaarten.length; j++) {
                String nummer = kaarten[j];
                deck[index] = soort + " " + nummer;
                index++;
            }
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] deck1 = new String[deck.length - 1];
        int index = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                deck1[index] = deck[i];
                index++;
            }
        }
        deck = deck1;
        return kaart;
    }


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setSize(750, 425);
            geklikt = true;
            deck = new String[52];
            int index = 0;

            for (int i = 0; i < typen.length; i++) {
                String kleur = typen[i];
                for (int j = 0; j < kaarten.length; j++) {
                    String kaart = kaarten[j];
                    deck[index] = kleur + " " + kaart;
                    index++;
                }
            }

            for (int i = 0; i < 13; i++) {
                speler1[i] = deelKaart();
                speler2[i] = deelKaart();
                speler3[i] = deelKaart();
                speler4[i] = deelKaart();
            }


            repaint();
        }
    }
    public void paint(Graphics g) {
        knop.setBackground(Color.RED);
        knop.setForeground(Color.WHITE);

        int x1 = 50;
        int x2 = 250;
        int x3 = 450;
        int x4 = 650;
        int y = 70;
        int y1 = 105;

        if (geklikt) {
            g.drawString("Speler 1", x1, y);
            g.drawString("Speler 2", x2, y);
            g.drawString("Speler 3", x3, y);
            g.drawString("Speler 4", x4, y);
            for (int i = 0; i < 13; i++) {
                g.drawString(speler1[i], x1, y1);
                g.drawString(speler2[i], x2, y1);
                g.drawString(speler3[i], x3, y1);
                g.drawString(speler4[i], x4, y1);
                y1 += 25;
            }
        }
    }
}
