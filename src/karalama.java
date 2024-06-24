
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class karalama extends JPanel implements Runnable {
    private int x,y;

    private int yon;


    public karalama() {
        x=0;
        y=0;
        yon=1;
        KeyListener l = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (KeyEvent.getKeyText(e.getKeyCode()).equals("A")) yon = 4;
                if (KeyEvent.getKeyText(e.getKeyCode()).equals("S")) yon = 1;
                if (KeyEvent.getKeyText(e.getKeyCode()).equals("D")) yon = 2;
                if (KeyEvent.getKeyText(e.getKeyCode()).equals("W")) yon = 3;

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        addKeyListener(l);
        setFocusable(true);
        new Thread(karalama.this).start();
    }
    public void run() {
        while (true) {



            if (yon == 1) y += 1;
            if (yon == 2) x += 1;
            if (yon == 3) y -= 1;
            if (yon == 4) x -= 1;
            repaint();
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                return;

            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(x,y,10,10);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new karalama());

        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import javax.swing.*;
//
//public class karalama extends JPanel implements Runnable {
//    private int x, y;
//    private int yon;
//
//    public karalama() {
//        x = 0;
//        y = 0;
//        yon = 1;
//
//        // KeyListener'ı ekleyelim
//        addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) { }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                if (KeyEvent.getKeyText(e.getKeyCode()).equals("A")) yon = 4;
//                if (KeyEvent.getKeyText(e.getKeyCode()).equals("S")) yon = 1;
//                if (KeyEvent.getKeyText(e.getKeyCode()).equals("D")) yon = 2;
//                if (KeyEvent.getKeyText(e.getKeyCode()).equals("W")) yon = 3;
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) { }
//        });
//
//        setFocusable(true);
//
//        // Kareyi hareket ettirmek için bir thread başlatalım
//        new Thread(this).start();
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            if (yon == 1) y += 20;
//            if (yon == 2) x += 20;
//            if (yon == 3) y -= 20;
//            if (yon == 4) x -= 20;
//
//            repaint();
//
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                return;
//            }
//        }
//    }
//
//    @Override
//    public void paint(Graphics g) {
//      g.fillRect(x,y,10,10);
//    }
//
//    public static void main(String[] args) {
//        JFrame f = new JFrame();
//        karalama k = new karalama();
//        f.add(k);
//        f.setSize(500, 500);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
//    }
//}
