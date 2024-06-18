import java.awt.*;
import javax.swing.*;

public class Jtable1 {
    JFrame f;
    JTable j;
    String[] columnNames={"Name", "Year", "Course"};
    Jtable1()
    {
        f=new JFrame();
        f.setTitle("JTable example");
        String data[][] ={{"Sirjan","2020","BCA"},{"Sujal","2020","BCA"}};
        j = new JTable(data, columnNames);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 400);
        f. setVisible(true);
    }
    public static void main(String args[])
    {
        new Jtable1();
    }
}
