package menu;

import javax.swing.*;
import java.awt.*;

public class manu extends JFrame {
    JMenu menyu;
    public manu(){
        menyu = new JMenu();
        menyu.setSize(50,50);
        menyu.setVisible(true);
        menyu.setBackground(Color.black);
        menyu.setMenuLocation(0,0);
        add(menyu);
    }
}
