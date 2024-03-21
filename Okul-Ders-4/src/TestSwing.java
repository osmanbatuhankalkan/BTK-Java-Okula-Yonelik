import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TestSwing extends JFrame{

    public TestSwing(){
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
        JButton jbLeft = new JButton("Left");
        JButton jbCenter = new JButton("Center");
        JButton jbRight = new JButton("Right");

        jbLeft.setBackground(Color.PINK);
        jbLeft.setForeground(Color.GREEN);
        jbCenter.setBackground(Color.LIGHT_GRAY);
        jbCenter.setForeground(Color.RED);
        jbRight.setToolTipText("Bu sağ butondur");
        jbRight.setBackground(Color.cyan);

        p1.add(jbLeft);
        p1.add(jbCenter);
        p1.add(jbRight);

        p1.setBorder(new TitledBorder("Three Button"));
        p1.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        Font largeFont = new Font("Times New Roman",Font.BOLD,20);
        LineBorder lineBorder = new LineBorder(Color.black,2);

        JPanel p2 = new JPanel(new GridLayout(1,2,5,5));
        JLabel lbRed = new JLabel("Red");
        JLabel lbOrange = new JLabel("Orange");

        lbRed.setForeground(Color.orange);
        lbOrange.setForeground(Color.red);

        lbRed.setFont(largeFont);
        lbOrange.setFont(largeFont);
        lbRed.setBorder(lineBorder);

        p2.add(lbRed);
        p2.add(lbOrange);
        p2.setBorder(new TitledBorder("Two Labels"));

        setLayout(new GridLayout(2,1,5,5));
        add(p1);
        add(p2);


    }
    public static void main(String[] args) {

        JFrame frame = new TestSwing();
        frame.setTitle("Test Swing");
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}