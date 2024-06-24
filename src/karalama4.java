import javax.swing.*;
import java.awt.*;

public class karalama4 extends JFrame implements Runnable {
    String yazi = "EŞŞEK";


    public karalama4() {
        new Thread(this).start();
        setSize(400, 400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void run() {
        while (true) {
            try {
                if (yazi.isEmpty()) {
                    Thread.sleep(500);
                } else {
                    Thread.sleep(10);
                }

            } catch (InterruptedException e) {
                return;
            }
            if (yazi.isEmpty()) {
                yazi = "EŞŞEK";
            } else {
                yazi = "";
            }
            repaint();
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(yazi, 150, getHeight() / 2);

    }

    public static void main(String[] args) {
        new karalama4();
    }
}
