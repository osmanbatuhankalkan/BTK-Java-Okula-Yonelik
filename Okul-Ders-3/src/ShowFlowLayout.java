import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.*;


public class ShowFlowLayout extends JFrame{

    public ShowFlowLayout () {

        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("XXX"));
        add(new JTextField(5));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("FlowLayout Example");
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}