import javax.swing.*;
import java.awt.*;



public class InternalFrameDemo extends JFrame {
    JFrame f1;
    JButton b1;
    InternalFrameDemo()
    {
        f1 = new JFrame("bca");
        f1.setSize(500,500);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);

        JInternalFrame iframe= new JInternalFrame("Internal frame",true,true,true,true);
        internalframe(iframe);
    }
    private void internalframe(JInternalFrame iframe)
    {
        iframe.setSize(300,200);
        iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        iframe.setLocation(50,50);

        b1=new JButton("b1");
        iframe.add(b1);
        f1.add(iframe);
        iframe.setVisible(true);
    }

    public static void main(String[] args) {
        new InternalFrameDemo();
    }
}
