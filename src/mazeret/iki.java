package mazeret;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class iki extends JFrame {
    String sifre = "";

    iki() {

        JTextField t = new JTextField();
        t.setEditable(false);
        t.setBounds(150, 100, 200, 50);
        add(t);

        JButton b1 = new JButton("a");
        b1.setBounds(50, 200, 80, 80);
        add(b1);
        JButton b2 = new JButton("b");
        b2.setBounds(150, 200, 80, 80);
        add(b2);
        JButton b3 = new JButton("c");
        b3.setBounds(250, 200, 80, 80);
        add(b3);
        JButton b4 = new JButton("d");
        b4.setBounds(50, 300, 80, 80);
        add(b4);
        JButton b5 = new JButton("e");
        b5.setBounds(150, 300, 80, 80);
        add(b5);
        JButton b6 = new JButton("f");
        b6.setBounds(250, 300, 80, 80);
        add(b6);
        JButton goster = new JButton("Goster");
        goster.setBounds(350, 250, 100, 80);
        add(goster);


        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sifre += e.getActionCommand();
                char c = (char) (e.getActionCommand().charAt(0) + 3);
                t.setText(t.getText()+c);
            }
        };
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        b6.addActionListener(listener);
        goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(sifre);
                sifre="";
            }
        });
    }


    public static void main(String[] args) {
        new iki();
    }
}
