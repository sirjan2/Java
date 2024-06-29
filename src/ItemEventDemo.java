import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;




public class ItemEventDemo extends JFrame implements ItemListener{
    JFrame f1;
    static JRadioButton rb1,rb2;
    static JComboBox<String> cb;
    static ButtonGroup bg;

    ItemEventDemo()
    {
        f1=new JFrame("Item Listner");
        f1.setSize(500,500);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));

        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        bg=new ButtonGroup();
        String country_name[]={"Nepal","Bhutan","India","China"};
        cb= new JComboBox<>(country_name);

        bg.add(rb1);
        bg.add(rb2);
        f1.add(rb1);
        f1.add(rb2);
        f1.add(cb);
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        cb.addItemListener(this);
        f1.setVisible(true);


    }
    public  static void main(String[]args)
    {
        new ItemEventDemo();
    }
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource()==rb1 && e.getStateChange()== ItemEvent.SELECTED)
        {
            JOptionPane.showMessageDialog(this,"You are male");
        }
        else if(e.getSource()==rb2 && e.getStateChange()==ItemEvent.SELECTED)
        {
            JOptionPane.showMessageDialog(this,"You are female");
        }

        else if(e.getSource()==cb && e.getStateChange()==ItemEvent.SELECTED)
        {
            JOptionPane.showMessageDialog(this,"Your country is"+cb.getSelectedItem());
        }
    }
}
