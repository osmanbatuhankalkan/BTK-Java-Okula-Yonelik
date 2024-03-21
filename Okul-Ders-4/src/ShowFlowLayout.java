import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame {

    public ShowFlowLayout(){

        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("XXX"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }
    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("Flowlayout Example");
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}