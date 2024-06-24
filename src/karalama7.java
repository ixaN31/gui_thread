import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class karalama7 extends JFrame implements Runnable {
    int x, y, r;
    int renk;

    public karalama7() {
        r = 10;
        renk = 0;
        new Thread(this).start();
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                renk = 1;
                x = e.getX();
                y = e.getY();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                renk = 0;
                x = e.getX();
                y = e.getY();
            }
        });
    }


    public void paint(Graphics g) {
        super.paint(g);
        if (renk == 0) g.setColor(Color.blue);
        else g.setColor(Color.red);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
    }

    public void run() {

        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                return;
            }

            repaint();
        }

    }

    public static void main(String[] args) {
        new karalama7();
    }
}
