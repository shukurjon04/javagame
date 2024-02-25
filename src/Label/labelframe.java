package Label;

import javax.swing.*;
import java.awt.*;

public class labelframe extends JFrame {
    JLabel label1;
    JLabel label2;
    JLabel label3;
    public labelframe(){
        super("Jlabel bilann tanishish ");
        setLayout(new FlowLayout());
        label1 = new JLabel("konstruktor orqali yozish");
        label1.setToolTipText("bu label1");
        add(label1);
        Icon rasm = new ImageIcon(getClass().getResource("ayol1.jpg"));
        label2 =new JLabel("rasm bilan chiqar",rasm,SwingConstants.LEFT);
        label2.setToolTipText("bu label2");
        add(label2);
        label3 = new JLabel();
        label3.setText("fefguafgyrsbfjdrfbffkghrgfrufkygf");
        label3.setIcon(rasm);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("bu label3");
        add(label3);

    }
}
