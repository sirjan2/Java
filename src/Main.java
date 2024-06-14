import java.awt.*;
import javax.swing.*;

class Main extends JFrame
{
    static JFrame f;
    static JButton b1,b2,b3;
    static JLabel l;
    public static void main (String args[])
    {
        f = new JFrame("Panel");
        l = new JLabel("Panel Label");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        JTextField tf = new JTextField(20);
        String faculity[]={"BCA", "BE", "BBA", "BSCIT"};
        JComboBox<String>cb = new JComboBox<String>(faculity);

        JList<String> ls=new JList<String >(faculity);
//        ls.setSelectedIndex(2);


        JPanel P = new JPanel();
        P.add(b1);
        P.add(b2);
        P.add(b3);

        P.add(l);

        P.add(tf);
        P.add(cb);
        P.add(ls);
        P.setBackground(Color.pink);
        f.add(P);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}