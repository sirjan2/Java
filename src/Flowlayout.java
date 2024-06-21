import java.awt.*;
import javax.swing.*;

public class Flowlayout {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Flowlayout()
    {
        f1= new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout(0,15,15));
        b1=new JButton("button 1");
        b2=new JButton("button 2");
        b3=new JButton("button 3");
        b4=new JButton("button 4");
        b5=new JButton("button 5");
        b6=new JButton("button 6");
        b7=new JButton("button 7");

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.setVisible(true);


    }
    public static void main(String args[])
    {
        new Flowlayout();
    }
}
