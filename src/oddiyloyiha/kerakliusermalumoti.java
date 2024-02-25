package oddiyloyiha;

import javax.swing.*;
import java.awt.*;

public class kerakliusermalumoti  extends JFrame {
JLabel label1;
JTextField textField1;

public kerakliusermalumoti(){
    super("ro'yxatdan o'tish ");
    setLayout(new FlowLayout());
    textField1 =new JTextField(10);
    label1 = new JLabel("ismingizni kirting ");
    add(label1);
    add(textField1);


}
}
