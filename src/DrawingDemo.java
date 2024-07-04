import java.awt.*;
import javax.swing.*;


public class DrawingDemo extends JFrame {
    public DrawingDemo()
    {
        setSize(500,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
//        drawlines
        g.drawLine(80,40,100,90);
        g.drawLine(20,90,100,40);
        g.drawLine(40,45,250,80);
        //draw rectangeles
        g.drawRect(20,150,60,50);
        g.fillRect(110,150,60,50);
        g.drawRoundRect(200,150,60,60,15,15);
        g.fillRoundRect(290,150,60,60,15,15);
        //draw elipse and circle
        g.drawOval(20,250,50,50);
        g.fillOval(100,250,75,50);
        g.drawOval(200,260,100,40);
        //draw arc
        g.drawArc(20,350,70,70,0,180);
        g.fillArc(70,350,70,70,0,75);
        //draw polygon
        int xpoints[]= {20,200,20,200,20};
        int ypoints[]={450,450,650,650,450};
        int num=5;
        g.drawPolygon(xpoints,ypoints,num);
    }
    public static void main(String[]args){
        new DrawingDemo();
    }
}
