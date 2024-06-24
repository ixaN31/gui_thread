import javax.swing.*;
import java.awt.*;

public class sin extends JPanel {
    public sin(){
        JFrame f = new JFrame();
        f.add(this);
        f.setSize(800,815);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g); // JPanel'in paint metodunu çağırarak arka planı temizle

        int width = getWidth();
        int height = getHeight();
        int originX = width / 2;
        int originY = height / 2;

        // X ve Y eksenlerini çiz
        g.drawLine(0, originY, width, originY);
        g.drawLine(originX, 0, originX, height);

        g.setColor(Color.blue);

        // Sinüs fonksiyonunu çiz
        for (int i = 0; i < width; i++) {
            double x = (i - originX) * 0.005; // x eksenini ölçeklendirin
            int sinY = (int)(100 * Math.tan(x));
            g.drawLine(i, originY - sinY, i, originY - sinY);
        }
    }

    public static void main(String[] args) {
        new sin();
    }
}
