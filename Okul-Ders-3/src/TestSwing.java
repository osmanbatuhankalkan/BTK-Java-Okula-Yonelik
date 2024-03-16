import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class TestSwing extends JFrame{
    public TestSwing() {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        JButton jbLeft = new JButton("Left");
        JButton jbCenter = new JButton("Center");
        JButton jbRight = new JButton("Right");

        jbLeft.setBackground(Color.WHITE);
        jbCenter.setForeground(Color.GREEN);
        jbRight.setToolTipText("This is right button....");
        p1.add(jbLeft);
        p1.add(jbRight);
        p1.add(jbCenter);

        p1.setBorder(new TitledBorder("Three Button"));
        p1.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        Font largeFont = new Font("Times Roman",Font.BOLD,20);
        LineBorder lineBorder = new LineBorder(Color.BLACK,2);

        JPanel p2 = new JPanel(new GridLayout(1,2,5,5));
        JLabel lbRed = new JLabel("Red");
        JLabel lbOrange = new JLabel("Orange");

        lbRed.setForeground(Color.RED);
        lbOrange.setForeground(Color.ORANGE);
        lbRed.setFont(largeFont);
        lbOrange.setFont(largeFont);
        p2.add(lbRed);
        p2.add(lbOrange);
        p2.setBorder(new TitledBorder("Two Labels"));

        setLayout(new GridLayout(2,1,5,5));
        add(p1);
        add(p2);

    }
    public static void main(String[] args)
    {
        JFrame frame = new TestSwing();
        frame.setSize(400, 200); // Setting the size of the frame
        frame.setVisible(true); // Making the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
