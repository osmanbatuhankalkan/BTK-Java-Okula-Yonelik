import java.awt.*;
import javax.swing.*;
public class TestFigurePanel extends JFrame{

    public TestFigurePanel() {
        setLayout(new GridLayout(2,3,5,5));
        add(new FigurePanel(FigurePanel.LINE));
        add(new FigurePanel(FigurePanel.RECTANGLE));
        add(new FigurePanel(FigurePanel.ROUND_RECTANGLE));
        add(new FigurePanel(FigurePanel.OVAL));
        add(new FigurePanel(FigurePanel.RECTANGLE,true));
        add(new FigurePanel(FigurePanel.ROUND_RECTANGLE,true));
    }

    public static void main(String[] args) {

        TestFigurePanel frame = new TestFigurePanel();
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}