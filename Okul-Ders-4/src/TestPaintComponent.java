import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;

public class TestPaintComponent extends JFrame{

    public TestPaintComponent() {
        add(new NewPanel());
    }
    public static void main(String[] args) {

        TestPaintComponent frame = new TestPaintComponent();
        frame.setTitle("Paint Component");
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class NewPanel extends JPanel {

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawLine(0,0,50,50);
            g.drawString("Merhaba", 0, 40);
        }
    }
}