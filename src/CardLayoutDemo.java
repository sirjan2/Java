import java.awt.CardLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CardLayoutDemo implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    CardLayout c1;

    CardLayoutDemo()
    {
        f1= new JFrame("Card layout example");
        f1.setSize(400,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1=new CardLayout();
        f1.setLayout(c1);
        b1= new JButton("Button 1");
        b2= new JButton("Button 2");
        b3= new JButton( "Button 3");
        b1.setBackground(Color.gray);
        b2.setBackground(Color.blue);
        b3.setBackground(Color.green);
        f1.add(b1,"1");
        f1.add(b2,"2");
        f1.add(b3,"3");
        f1.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }
    public static void main(String[]args)
    {
        new CardLayoutDemo();
    }
    public void actionPerformed(ActionEvent event)
    {
        c1.next(f1.getContentPane());

    }
}
