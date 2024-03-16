import javax.swing.*;
import java.awt.*;
import java.awt.*;

public class TestPanels extends JFrame{

    public TestPanels()  {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));

        for(int i=1;i<=9;i++) {
            p1.add(new JButton(""+i));

        }
        //p1 paneli oluşturuldu.
        p1.add(new JButton(""+0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        //p2 paneli oluştur
        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("Zaman gösterimi"),BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        //content 1 frame e ekle
        add(p2, BorderLayout.EAST);
        add(new JButton("Here"),BorderLayout.CENTER);

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestPanels frame = new TestPanels();
        frame.setTitle("Panel");
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
