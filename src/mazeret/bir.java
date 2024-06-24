package mazeret;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class bir extends JFrame {
    int sayac=0;
    bir() {
        JLabel l = new JLabel("Sayac : "+sayac);
        l.setBounds(20,20,80,20);
        add(l);

        setSize(100,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            sayac++;
            l.setText("Sayac : "+sayac);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }


    public static void main(String[] args) {
        new bir();
    }

}
