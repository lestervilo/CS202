package TeenPower;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TeenPower extends JPanel {

    int age; //this is a field
    ImageIcon img;
    
    public TeenPower() {
        // Constructor code here
        String input = JOptionPane.showInputDialog("Enter your age:");
        age = Integer.parseInt(input);
        img = new ImageIcon("teenpower.png");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawing code here
        if (age >= 13 && age <= 19) {
            g.drawString("TEEN POWER!", 50, 50);
            img.paintIcon(null, g, 50, 70);
        } else {
            g.drawString("No teen power for you.", 50, 50);
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new TeenPower());
        window.setVisible(true);
    }
        
}
