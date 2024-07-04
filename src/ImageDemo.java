import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
public class ImageDemo extends JFrame {
    Image img;
    ImageDemo(){
       setTitle ("Displaying image");
       setSize(500,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       try {
           File imagFile= new File ("C:\\Users\\Admin\\Downloads\\1-1.jpg");
           img= ImageIO.read(imagFile);
       }
       catch (Exception e){
           System.out.println("Cannot load image:"+e.getMessage());
           System.exit(0);
       }
       setVisible(true);


    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        if (img != null){
            g.drawImage(img,getInsets().left,getInsets().top,500,500,null);
        }

    }

    public static void main(String[] args) {
        new ImageDemo();
    }
}

