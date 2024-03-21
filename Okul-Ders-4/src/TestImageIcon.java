import javax.swing.*;
import java.awt.*;
public class TestImageIcon extends JFrame {

    private ImageIcon tsIcon = new ImageIcon("ts.jpg");
    private ImageIcon gsIcon = new ImageIcon("gs.png");
    private ImageIcon bjkIcon = new ImageIcon("bjk.png");

    public TestImageIcon() {

        setLayout(new GridLayout(1,3,5,5));
        add(new JLabel(tsIcon));
        add(new JLabel(gsIcon));
        add(new JLabel(bjkIcon));
    }
    public static void main(String[] args) {

        TestImageIcon frame = new TestImageIcon();
        frame.setTitle("ImageIcon");
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}