package Practice;

import javax.swing.JPanel;

public class MethodExample extends JPanel {
    
    public MethodExample() {
        //Your custom initialization code here
        happyBirthday();
    }

    public void happy() {
         System.out.println("Happy birthday to you!");
    }

    public void happyBirthday() {
        happy();
        happy();
        System.out.println("Happy Birthday");
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
