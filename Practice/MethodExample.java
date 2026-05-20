package Practice;

import javax.swing.JPanel;
import java.swing.JFrame;
import java.awt.Graphics;

public class MethodExample extends JPanel {
    
    public MethodExample() {
        //Your custom initialization code here
        happyBirthday("Eve");
    }

    public void happy() {
         System.out.println("Happy birthday to you!");
    }

    public void happyBirthday(String birthdayChild) {
        happy();
        happy();
        System.out.println("Happy Birthday dear " + birthdayChild + "!");
        happy();

    @Override
    public void paintComponent(java.awt.Graphics g) {
        //Your custom rendering code here
    }

    public static void main(String[] args) {
        var window = new javax.swing.JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new MethodExample());
        window.setVisible(true);
    }
    
}
