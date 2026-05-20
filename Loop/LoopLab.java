package Loop;

import javax.swing.*;
import java.awt.*;

public class LoopLab extends JPanel {

    int size;          // dimension of table
    char choice;       // M = multiplication, A = addition

    // Constructor
    public LoopLab() {

        // Ask for table size
        String input = JOptionPane.showInputDialog("Enter table size (n x n):");
        String type = JOptionPane.showInputDialog("Choose table type:\n(M) Multiplication\n(A) Addition");

        size = Integer.parseInt(input);
        choice = Character.toUpperCase(type.charAt(0));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Window size
        int w = getWidth();
        int h = getHeight();

        // Cell size stretches with window
        int cellWidth = w / size;
        int cellHeight = h / size;

        // Draw rows
        for (int i = 1; i <= size; i++) {

            // Draw columns
            for (int j = 1; j <= size; j++) {

                int x = (j - 1) * cellWidth;
                int y = (i - 1) * cellHeight;

                // Header row/column color
                if (i == 1 || j == 1) {
                    g.setColor(Color.YELLOW);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                }

                // Fill cell
                g.fillRect(x, y, cellWidth, cellHeight);

                // Border
                g.setColor(Color.BLACK);
                g.drawRect(x, y, cellWidth, cellHeight);

                // Determine value
                int value;

                if (choice == 'A') {
                    value = i + j;
                } else {
                    value = i * j;
                }

                // Draw number at top-left
                g.drawString(String.valueOf(value), x + 5, y + 15);
            }
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Loop Lab");

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new LoopLab());

        frame.setVisible(true);
    }
}