import java.awt.*;
import javax.swing.*;

public class Menu {
    static JFrame f;
    static JLabel l;
    static  JMenuBar mb;
    static JMenu x1, x2;
    static JMenuItem m1, m2, m3, s1, s2;

    public static void main(String args[]){
        f= new JFrame("Menu");
        l= new JLabel("This is Menu");
        mb= new JMenuBar();
        x1=new JMenu("Menu");
        x2= new JMenu("Submenu");
        m1= new JMenuItem("item1");
        m2= new JMenuItem("item2");
        m3= new JMenuItem("item3");
        s1= new JMenuItem("subitem1");
        s2= new JMenuItem("subitem2");
        x1.add(m1);
        x1.add(m2);
        x1.add(m3);

        x2.add(s1);
        x2.add(s2);

        x1.add(x2);
        mb.add(x1);

        f.setJMenuBar(mb);
        f.add(l);
        f.setVisible(true);
        f.setSize(500,500);
    }
}
