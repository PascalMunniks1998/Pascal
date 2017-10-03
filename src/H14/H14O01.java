package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class H14O01 extends Applet{

    private String[] typen = {"klaver", "schoppen", "harten", "ruiten"};
    private String[] kaarten = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer  "};
    private String[] deck = new String[52];
    Button knop;
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


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random kaart = new Random();
            int r = kaart.nextInt(52);
            k = r;
            geklikt = true;
            repaint();
        }
    }
    public void paint(Graphics g) {
        knop.setBackground(Color.RED);
        knop.setForeground(Color.WHITE);

        if (geklikt == true) {
            g.drawString("" + deck[k], 50, 60);
        }
    }
}
