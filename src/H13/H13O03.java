package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13O03 extends Applet {
    Button baksteenButton;
    Button betonblokButton;
    boolean bakstenen;
    boolean betonblokken;



    public void init() {
        setSize(1100, 550);
        baksteenButton = new Button("Bakstenen");
        baksteenButton.addActionListener(new KnoplistnerBaksteen());
        add (baksteenButton);
        betonblokButton = new Button("Betonblokken");
        betonblokButton.addActionListener(new KnoplistnerBetonblok());
        add (betonblokButton);
    }

    public void paint(Graphics g) {
        if (bakstenen) {
            bakstenenMuur(g);
        } else if (betonblokken) {
            betonblokkenMuur(g);
        }
    }


    void bakstenenMuur(Graphics g) {
        int y, x, breedte, hoogte;
        x = 50;
        y = 50;
        breedte = 500;
        hoogte = 250;

        int breedte2=50;
        int hoogte2=25;

        g.setColor(Color.RED);
        g.fillRect(x, y+25, breedte, hoogte);

        for (int i = 0; i < 5; i++) {
            x = 50;
            y += 25;
            for (int kolom = 0; kolom < 10; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, breedte2, hoogte2);
                x += 50;
            }
            x = 25;
            y += 25;
            for (int kolom = 0; kolom < 11; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, breedte2, hoogte2);
                x += 50;
            }
        }
    }

    void betonblokkenMuur(Graphics g) {
        int y, x, breedte, hoogte;
        x = 50;
        y = 50;
        breedte = 500;
        hoogte = 300;

        int breedte2=100;
        int hoogte2=50;

        g.setColor(Color.GRAY);
        g.fillRect(x, y+50, breedte, hoogte);

        for (int i = 0; i < 3; i++) {
            x = 100;
            y += 50;
            for (int kolom = 0; kolom < 4; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, breedte2, hoogte2);
                x += 100;
            }
            x = 50;
            y += 50;
            for (int kolom = 0; kolom < 5; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, breedte2, hoogte2);
                x += 100;
            }
        }
    }

    class KnoplistnerBaksteen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            bakstenen = true;
            betonblokken = false;
            baksteenButton.setEnabled(false);
            betonblokButton.setEnabled(true);
            repaint();
        }
    }

    class KnoplistnerBetonblok implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            bakstenen = false;
            betonblokken = true;
            baksteenButton.setEnabled(true);
            betonblokButton.setEnabled(false);
            repaint();
        }
    }
}
