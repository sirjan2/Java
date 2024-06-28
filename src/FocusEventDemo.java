import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventDemo extends JFrame implements FocusListener {
    JFrame f1;
    JLabel l1,l2,l3;
    JButton b1;
    JTextField t1,t2,t3;

    FocusEventDemo()
    {
        f1 = new JFrame("Multiplier");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(600,600);
        f1.setLayout(new GridLayout(4,2));



        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        l3 = new JLabel("Result");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        b1 = new JButton("Multiply");

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.add(b1);

        t1.addFocusListener(this);
        t2.addFocusListener(this);
        b1.addFocusListener(this);

        f1.setVisible(true);
    }

    public static void main(String[] args)
    {
        new FocusEventDemo();
    }

    public void focusGained(FocusEvent e)
    {
        int a,b,c;

        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());

        if(e.getSource() == b1)
        {
            c = a*b;
            t3.setText(String.valueOf(c));
        }
    }

    public  void focusLost(FocusEvent e)
    {
        if (e.getSource() == t1 && t1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"enter number to the place");
            t1.requestFocus();
        }

        if (e.getSource() == t2 && t2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"enter number to the place");
            t2.requestFocus();
        }
    }
}