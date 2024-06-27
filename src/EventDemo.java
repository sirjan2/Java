import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventDemo implements ActionListener{
    JFrame f1;
    JButton b1,b2;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    EventDemo()
    {
        f1=new JFrame("add and sub");
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setSize(400,400);
        f1.setLayout(new GridLayout(4,2));
        l1=new JLabel("num1");
        l2=new JLabel("num2");
        l3=new JLabel("result");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        t3.setEditable(false);
        b1=new JButton("add");
        b2=new JButton("sub");
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);

        f1.add(l3);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);


        b1.addActionListener( this);
        b2.addActionListener( this);


}

    public static void main(String[]args)
    {
        new EventDemo();
    }

    public void actionPerformed(ActionEvent event)
    {
        int a,b,c;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        if(event.getSource()==b1)
        {
            c=a+b;
        }
        else if (event.getSource()==b2){
            c=a-b;
        }
        else {
            c=0;
        }
        t3.setText(String.valueOf(c));
    }


}
