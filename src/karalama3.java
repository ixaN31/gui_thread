import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class karalama3 extends JPanel implements Runnable {
    private int[] dizi = new int[30];

    karalama3() {
        Random rand = new Random();
        new Thread(this).start();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(50,200);
        }
    }

    public void run() {
        int arasay;
        for (int i = 0 ;i<dizi.length;i++) {
            for (int j = 0 ;j<i;j++){
                if (dizi[j]>dizi[i]){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    arasay= dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=arasay;
                    repaint();
                }
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.exit(0);

    }

    public void paint(Graphics g) {
        super.paint(g);
        int y=10;
        for (int i = 0 ; i<dizi.length;i++){
            g.drawLine(0,y,dizi[i],y);
            y+=10;
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new karalama3());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 350);
        f.setVisible(true);
    }
}
