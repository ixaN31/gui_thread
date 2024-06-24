import javax.swing.*;
import java.awt.*;

public class karalama6 extends JPanel implements Runnable {
    int x, y, r, yon;

    public karalama6() {
        r = 10;
        yon = 1;
        JFrame f = new JFrame();
        f.add(this);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x = getWidth() / 2;
        y = getHeight() / 2;
        new Thread(this).start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(x - r, y - r, 2 * r, 2 * r);
    }


    public void run() {
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                return;
            }
            if (r >= y) yon = 2;
            if (r < 10) yon = 1;
            if (yon == 1) r += 3;
            if (yon == 2) r -= 3;
            repaint();

        }

    }

    public static void main(String[] args) {
        new karalama6();
    }
}
