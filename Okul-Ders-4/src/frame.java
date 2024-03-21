import javax.swing.*;

public class frame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My Frame");
        JButton button = new JButton("OK");
        frame.add(button);



        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println("test");
    }
}