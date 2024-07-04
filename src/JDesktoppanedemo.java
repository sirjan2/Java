import javax.swing.*;
import java.awt.*;



public class JDesktoppanedemo extends JFrame {
    JFrame f1;
    JButton b1;
    JDesktoppanedemo()
    {
        f1 = new JFrame("bca");
        f1.setSize(500,500);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);

        JDesktopPane dpane= new JDesktopPane();
        desktopPane(dpane);
        f1.add(dpane,BorderLayout.CENTER);
    }
    private void desktopPane (JDesktopPane dpane)
    {
        dpane.setLayout(null);
        JFrame f2= new JFrame("Bca 2");
        f2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f2.setSize(400,400);
        f2.setVisible(true);
        f2.setLocationRelativeTo(null);
        f2.setLayout(null);
        dpane.add(f2);

    }

    public static void main(String[] args) {
        new JDesktoppanedemo();
    }
}
