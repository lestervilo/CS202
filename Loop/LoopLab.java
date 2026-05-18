package Loop;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class LoopLab extends JPanel {
    public LoopLab() {
        // Constructor code here
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawing code here
        int x = 0;
        int y = 0;
        var w = getWidth();
        var h = getHeight();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        
    }

    public static void main(String [] args) {
        var frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new LoopLab());
        frame.setVisible(true);
    }
    
}
