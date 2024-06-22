import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {
    JFrame f1;
    JButton b1,b2,b3,b4,b5;
    BorderLayoutDemo()
    {
        f1=new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400,400);
        f1.setLayout(new BorderLayout(10,10));

        b1=new JButton("button1");
        b2=new JButton("button2");
        b3=new JButton("button3");
        b4=new JButton("button4");
        b5=new JButton("button5");

        f1.add(b1,BorderLayout.NORTH);
        f1.add(b2,BorderLayout.SOUTH);
        f1.add(b3,BorderLayout.WEST);
        f1.add(b4,BorderLayout.CENTER);
        f1.add(b5,BorderLayout.EAST);
        f1.setVisible(true);
    }
    public static void main(String[]args)
    {
        new BorderLayoutDemo();

    }
}
