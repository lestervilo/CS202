package ConditionalLab;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ConditionalLab extends JPanel {

    //Fields
    int age;
    char gender;
    ImageIcon img, img1, img2, img3, img4, img5, img6, img7, img8;
    
    public ConditionalLab() {
        // Constructor code here
        char gender = JOptionPane.showInputDialog("What is your gender? (Type M for male and F for female)").charAt(0);
        String input = JOptionPane.showInputDialog("What is your age at the end of the year?");

        age = Integer.parseInt(input);
        this.gender = gender;

        img = new ImageIcon("rockchapel.jpg");
        img1 = new ImageIcon("builder_of_faith.png");
        img2 = new ImageIcon("messenger_of_hope.png");
        img3 = new ImageIcon("gatherer_of_light.png");
        img4 = new ImageIcon("RS.jpg");
        img5 = new ImageIcon("deacon.jpg");
        img6 = new ImageIcon("teacher.jpg");
        img7 = new ImageIcon("priest.jpg");
        img8 = new ImageIcon("elders.jpg");
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Youngwomen
        if (gender == 'F' || gender == 'f') {
            if (age >= 0 && age < 12) {
                g.drawString("You go to Primary!", 50, 50);
                img.paintIcon(null, g, 50, 70);
            } else if (age >= 12 && age <= 13) {
                g.drawString("You are a Builder of Faith.", 50, 50);
                img1.paintIcon(null, g, 50, 70);
            } else if (age >= 14 && age <= 15) {
                g.drawString("You are a Messenger of Hope.", 50, 50);
                img2.paintIcon(null, g, 50, 70);
            } else if (age >= 16 && age <= 17) {
                g.drawString("You are a Gatherer of Light.", 50, 50);
                img3.paintIcon(null, g, 50, 70);
            } else if (age >= 18 && age <= 119) {
                g.drawString("You are a member of the Relief Society.", 50, 50);
                img4.paintIcon(null, g, 50, 70);
            } else {
                g.drawString("Are you sure you typed that correctly?", 50, 50);
            }

            //Youngmen
        } else if (gender == 'M' || gender == 'm') {
            if (age >= 0 && age < 12) {
                g.drawString("You go to Primary!", 50, 50);
            } else if (age >= 12 && age <= 13) {
                g.drawString("You belong to the Deacons quorum.", 50, 50);
                img5.paintIcon(null, g, 50, 70);
            } else if (age >= 14 && age <= 15) {
                g.drawString("You belong to the Teachers quorum.", 50, 50);
                img6.paintIcon(null, g, 50, 70);
            } else if (age >= 16 && age <= 17) {
                g.drawString("You belong to the Priests quorum.", 50, 50);
                img7.paintIcon(null, g, 50, 70);
            } else if (age >= 18 && age <= 119) {
                g.drawString("You belong to the Elders quorum.", 50, 50);
                img8.paintIcon(null, g, 50, 70);
            } else {
                g.drawString("Are you sure you typed that correctly?", 50, 50);
            }

            //error message
        } else {
            g.drawString("Are you sure you typed that correctly?", 50, 50);
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new ConditionalLab());
        window.setVisible(true);
    }
}
