import javax.swing.*;
import java.awt.event.*;

public class butonSay extends JFrame {
    int say;

    butonSay() {
        say = 0;
        JButton b = new JButton(say + "");
        b.setBounds(150, 180, 100, 40);
        add(b);
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b.addMouseListener(new MouseListener() {
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
                say++;
                b.setText(say + "");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new butonSay();
    }

}
