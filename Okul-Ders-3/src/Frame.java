import javax.swing.*;
import java.awt.*;

public class Frame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Button button = new JButton("OK");

        JFrame frame = new JFrame("My Frame");
        JButton button = new JButton("OK");
        frame.add(button);

        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}