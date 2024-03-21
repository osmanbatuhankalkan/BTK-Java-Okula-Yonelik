import java.awt.GridLayout;
import javax.swing.*;

public class ShowGridLayout extends JFrame {

    public ShowGridLayout(){
        setLayout(new GridLayout(3,2,5,5));

        add(new JLabel("First Name: "));
        add(new JTextField(8));
        add(new JLabel("Phone: "));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }
    public static void main(String[] args) {

        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("Grid Layout Example");
        frame.setSize(200,125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}