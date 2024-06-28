import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MouseEventDemo extends JFrame implements MouseListener {
    static JLabel l1,l2,l3;

    public static void main(String[] args)
    {
        JFrame f1= new JFrame(("Mouse"));
                f1.setSize(500,500);
                f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                JPanel p =new JPanel();
                p.setLayout(new GridLayout(3,1,5,5));
                l1= new JLabel("event 1:");
                l2= new JLabel("event 2");
                l3=new JLabel("event 3");
                MouseEventDemo m = new MouseEventDemo();
                p.add(l1);
                p.add(l2);
                p.add(l3);
                f1.add(p);
                f1.addMouseListener(m);
                f1.setVisible(true);

    }
    public void  mousePressed(MouseEvent e){
        l1.setText("mouse poressed at point:"+ e.getX()+","+e.getY());
    }
    public void mouseReleased(MouseEvent e){
        l1.setText("mouse released at point:"+e.getX()+","+e.getY());

    }
    public void mouseExited(MouseEvent e){
        l2.setText("mouse exited at point:"+e.getX()+","+e.getY());

    }
    public void mouseEntered(MouseEvent e){
        l2.setText("mouse entered at point:"+e.getX()+","+e.getY());
    }
    public void mouseClicked(MouseEvent e){
        l3.setText("mouse clicked counted:"+e.getX()+","+e.getY()+"Mouse clicked"+e.getClickCount());
    }

}
