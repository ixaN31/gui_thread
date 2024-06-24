import javax.swing.*;
import java.awt.*;

public class karalama5 extends JPanel implements Runnable {
    int y,x;
    int yon;
    int r;

    public karalama5() {
        r=25;
        x=250;y=25;yon=1;
        new Thread(this).start();
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.orange);
        g.fillOval(x-r,y-r,2*r,2*r);
    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                return;
            }
            if (y>=getHeight()-r){
                yon=0;
            }if (y<=25){
                yon=1;
            }
            if (yon==1){
                y+=5;
            }
            if (yon==0){
                y-=5;
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new karalama5());
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}