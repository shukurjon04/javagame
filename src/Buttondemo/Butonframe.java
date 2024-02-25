package Buttondemo;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Butonframe extends JFrame {
    JButton button1;
    JButton button2;
    public Butonframe(){
        super("button bilan tanishsish ");
        button1 = new JButton("oddiy button");
        setLayout(new FlowLayout());
        button1.setBackground(Color.getColor("green"));
        add(button1);
        Icon icon = new ImageIcon(getClass().getResource("true.png"));
        Icon icon1 = new ImageIcon(getClass().getResource("images.png"));
        icon.getIconHeight();
        icon.getIconWidth();
        button2 = new JButton("button2",icon);
        button2.setRolloverIcon(icon1);
        add(button2);
        Handler handler = new Handler();
        button1.addActionListener(handler);
        button2.addActionListener(handler);


    }
    private class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,String.format("siz %s ni bosdingiz ",e.getActionCommand()));
        }
    }
}
