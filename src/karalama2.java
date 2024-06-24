import javax.swing.*;
import java.awt.*;

public class karalama2 extends JPanel {


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int w = getWidth()/2;
        int h = getHeight()/2;
        int r = 80;
        g.setColor(Color.darkGray);
        g.fillArc(w-r,w-r,2*r,2*r,0,72);
        g.setColor(Color.orange);
        g.fillArc(w-r,w-r,2*r,2*r,72,144);
        g.setColor(Color.blue);
        g.fillArc(w-r,w-r,2*r,2*r, 216, 54);
        g.setColor(Color.red);
        g.fillArc(w-r,w-r,2*r,2*r, 270,36);
        g.setColor(Color.MAGENTA);
        g.fillArc(w-r,w-r,2*r,2*r,306,54);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new karalama2());
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
