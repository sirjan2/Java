import javax.swing.*;


public class Dialogbox {
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Main Window");
        JOptionPane.showMessageDialog(frame, "This is dialog box.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
