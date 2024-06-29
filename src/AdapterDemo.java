import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class AdapterDemo extends WindowAdapter {
    JFrame f1;
    AdapterDemo()
    {
        f1=new JFrame();
        f1.setSize(500,500);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.addWindowListener(this);
        f1.setVisible(true);

    }
    public void windowClosing(WindowEvent e)
    {
        JOptionPane.showMessageDialog(f1,"good bye");
    }
    public  void windowOpened(WindowEvent e)
    {
        JOptionPane.showMessageDialog(f1,"hello");
    }
    public  void windowIconified(WindowEvent e)
    {
        JOptionPane.showMessageDialog(f1,"see you later");
    }
    public  void windowDeiconified(WindowEvent e)
    {
        JOptionPane.showMessageDialog(f1,"Welcome Back");
    }
    public  static void main(String[]args)
    {
        new AdapterDemo();
    }
}
