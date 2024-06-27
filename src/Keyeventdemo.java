import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Keyeventdemo {
    JFrame f1;
    JLabel l1;
    JTextField t1;
    Keyeventdemo()
    {
        f1=new JFrame("BCA");
        f1.setSize(400,400);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(0));
        l1=new JLabel("Email");
        t1=new JTextField(20);
        f1.add(l1);

    }
}
