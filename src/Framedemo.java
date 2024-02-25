import javax.swing.*;
import java.awt.*;

public class Framedemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Jframe bilan tanishish");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
      /*  JWindow salom = new JWindow();
        salom.setBackground(Color.black);
        salom.setLocation(20,20);
        salom.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        salom.setSize(200,200);
        salom.setVisible(true);*/
    }
}
