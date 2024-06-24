import javax.swing.*;
import java.awt.*;

public class cember_artieksi extends JPanel {
    int r;
    int x;
    int y;
    boolean isIN;

    cember_artieksi() {
        r = 150;
        isIN = false;
        JFrame f = new JFrame();
        f.add(this);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        x = getWidth() / 2;
        y = getHeight() / 2;
    }

    public void paint(Graphics g) {
        g.drawOval(x - r, y - r, 2 * r, 2 * r);

        for (int y=0;y<getWidth();y+=5){
            for (int x = 0; x < getHeight(); x+=5) {
                double uzaklık=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));

                if (uzaklık<r){
                    g.setColor(Color.red);
                    g.drawString("-",x,y);
                }
                else {
                    g.setColor(Color.blue);
                    g.drawString("+",x,y);
                }
            }
        }

    }

    public static void main(String[] args) {
        new cember_artieksi();
    }
}
