package LabOrientation;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class yellow extends JPanel{
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawString("A: Her falt'ring hand upon the balustrade,", 50, 50); //I used the same x value for all lines so they are all left-aligned, and I increased the y value by 10 for each line to space them out vertically.
        g.drawString("B: Old Angela was feeling for the stair,", 50, 60);
        g.drawString("C: When Madeline, St. Agnes' charmed maid,", 50, 70);
        g.drawString("D: Rose, like a missioned spirit, unaware:", 50, 80);
        g.drawString("E: With silver taper's light, and pious care,", 50, 90);
        g.drawString("F: She turned, and down the aged gossip led", 50, 100);
        g.drawString("G: To a safe level matting. Now prepare,", 50, 110);
        g.drawString("H: Young Porphyro, for gazing on that bed;", 50, 120);
        g.drawString("I: She comes, she comes again, lke ring dove frayed and fled", 50, 130);
        g.drawString("by Spenserian Stanza", 50, 150);
    }

    void main() {
        var frame = new JFrame("Yellow");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new yellow());
        frame.setVisible(true);
    }
}


/* 
(1 point) Explain what a class is.
(1 point) Say the name of the class you wrote. (yellow)
(1 point) Explain what a method is.
(1 point) State how many methods there are in your class.
(1 point) State the names of the methods you wrote. (paintComponent(Graphics g), main())
(2 points) State which method gets called first. (The main() method gets called first because it is the entry point of a Java program.)
(2 points) Explain the purpose of each of the parameters (first, second, third) accepted by the drawString method.
(1 point)Explain how you selected x/y coordinates for your text.
(2 points) Show how you compile the program from the command-line.
(2 points) Explain the difference between a .java and a .class file.
(2 points) Show how you run the program from the command prompt.
(2 points) Show that your source code is neatly and consistently indented.
(2 points) Show that your code includes at least one comment. 
*/