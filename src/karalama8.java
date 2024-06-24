import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class karalama8 extends JFrame implements Runnable {
    int x, y, r, s, draw;

    public karalama8() {
        draw = 0;
        r = 5;
        new Thread(this).start();
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (KeyEvent.getKeyText(e.getKeyCode()).equals("C")) {
                    s = 1;
                }
                if (KeyEvent.getKeyText(e.getKeyCode()).equals("X")) r += 2;
                if (KeyEvent.getKeyText(e.getKeyCode()).equals("Z")) r -= 2;
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                draw = 1;
                s=0;
                x = e.getX();
                y = e.getY();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                draw=0;
                s=0;
            }
        });
    }

    public void paint(Graphics g) {
        if (s == 1) super.paint(g);
        if (draw == 1) {
            g.fillOval(x - r, y - r, 2 * r, 2 * r);
        }


    }

    public void run() {
        while (true) {
            repaint();

        }


    }


    public static void main(String[] args) {
        new karalama8();
    }
}
