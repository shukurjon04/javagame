package textfield;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textframe extends JFrame {
        JTextField textField1;
        JTextField textField2;
        JTextField textField3;
        JPasswordField passwordField;

        public textframe(){
            super("Jtextfield bilann tanishish ");
            setLayout(new FlowLayout());
            textField1 = new JTextField(10);
            add(textField1);
            textField2 = new JTextField("text field 2");
            add(textField2);
            textField3 = new JTextField("ozgarmas qiymat");
            textField3.setToolTipText("sjdbs");
            textField3.setEditable(false);
            add(textField3);
            passwordField = new JPasswordField("gita ",10);
            passwordField.setToolTipText("parolni kiriting ");
            add(passwordField);
            Handler handler = new Handler();
            textField1.addActionListener(handler);
            textField2.addActionListener(handler);
            textField3.addActionListener(handler);
        }
        private class Handler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                String xabar="";
                if (e.getSource() == textField1){
                    xabar = String.format("textField1: %s ",e.getActionCommand());
                }
                if (e.getSource() == textField2){
                    xabar = String.format("textField2: %s ",e.getActionCommand());
                }
                if (e.getSource() == textField3){
                    xabar = String.format("textField2: %s ",e.getActionCommand());
                }
                if (e.getSource() == passwordField){
                    xabar = String.format("passwordField: %s ",e.getActionCommand());
                }
                JOptionPane.showMessageDialog(null,xabar);
            }
        }
}


