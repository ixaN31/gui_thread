import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class asalGUI extends JFrame {

    private static int asalSayac = 0;
    private JButton buton1;
    private JButton buton2;
    private JButton buton3;
    private JButton buton4;
    private JButton buton5;
    private boolean devam = true;
    private Thread asalThread;

    public asalGUI() {
        setTitle("Asal Sayılar");

        buton1 = new JButton(sonrakiAsal());
        buton1.setBounds(10, 10, 80, 20);
        add(buton1);
        buton2 = new JButton(sonrakiAsal());
        buton2.setBounds(90, 10, 80, 20);
        add(buton2);
        buton3 = new JButton(sonrakiAsal());
        buton3.setBounds(170, 10, 80, 20);
        add(buton3);
        buton4 = new JButton(sonrakiAsal());
        buton4.setBounds(250, 10, 80, 20);
        add(buton4);
        buton5 = new JButton(sonrakiAsal());
        buton5.setBounds(330, 10, 80, 20);
        add(buton5);

        setSize(450, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                devam = !devam;

                if (devam){
                    startThread();
                }else{
                    stopThread();
                }
            }
        };

        buton1.addActionListener(listener);
        buton2.addActionListener(listener);
        buton3.addActionListener(listener);
        buton4.addActionListener(listener);
        buton5.addActionListener(listener);

        startThread(); // Thread'i başlat
    }

    public void startThread(){
        asalThread=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        asalThread.sleep(500);
                        kaydirVeGuncelle();
                    }catch (Exception e ){
                        break;
                    }
                }

            }
        });
        asalThread.start();
    }

    public void stopThread(){
        asalThread.interrupt();
    }

    private void kaydirVeGuncelle() {
        buton1.setText(buton2.getText());
        buton2.setText(buton3.getText());
        buton3.setText(buton4.getText());
        buton4.setText(buton5.getText());
        buton5.setText(sonrakiAsal());
    }

    private String sonrakiAsal() {
        int sayac = 0;

        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isAsal(i)) {
                if (sayac == asalSayac) {
                    asalSayac++;
                    return String.valueOf(i);
                }
                sayac++;
            }
        }
        return "0";
    }

    private boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new asalGUI();
    }
}