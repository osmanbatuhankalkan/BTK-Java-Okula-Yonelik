import javax.swing.*;
import java.awt.*;
public class TestButtonIcon extends JFrame {
    private ImageIcon tsIcon = new ImageIcon("ts.jpg");
    private ImageIcon gsIcon = new ImageIcon("gs.png");
    private ImageIcon bjkIcon = new ImageIcon("bjk.png");

    public TestButtonIcon() {

        this.setLayout(new FlowLayout());
        JButton jbt = new JButton("Click", tsIcon);
        jbt.setPressedIcon(gsIcon);
        jbt.setRolloverIcon(bjkIcon);
        this.add(jbt);

        JCheckBox check = new JCheckBox("Student", true);
        JRadioButton radio = new JRadioButton("Student");
        check.setForeground(Color.RED);
        check.setBackground(Color.WHITE);
        this.add(check);
        this.add(radio);

        ButtonGroup gr = new ButtonGroup();
        gr.add(check);
        gr.add(radio);

        JLabel lb = new JLabel("Logo", tsIcon, JLabel.CENTER);
        lb.setHorizontalTextPosition(JLabel.CENTER);
        lb.setIconTextGap(5);
        this.add(lb);

        JTextField txt = new JTextField("XXXX");
        txt.setForeground(Color.red);
        txt.setHorizontalAlignment(JTextField.RIGHT);
        this.add(txt);
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new TestButtonIcon();
            frame.setTitle("ImageIcon");
            frame.setSize(800,800);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}