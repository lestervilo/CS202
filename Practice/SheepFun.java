package Practice;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class SheepFun extends JPanel {
	
	public SheepFun() {
		//Your custom initialization code here
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
        g.setColor(Color.GREEN);
        var w = getWidth();
        var h = getHeight();
        var dx = 20;

        //draw the grassy background
        g.fillRect(0, 0, w, h);

        //draw the sheep's body
        g.setColor(Color.WHITE);
        g.fillOval(dx+75, 200, 225, 100);

        //draw the sheep's head
        g.fillOval(dx+50, 150, 75, 75);

        //draw the sheep's legs
        g.fillRect(dx+100, 250, 25, 100);
        g.fillRect(dx+150, 250, 25, 100);
        g.fillRect(dx+200, 250, 25, 100);
        g.fillRect(dx+250, 250, 25, 100);
	}

	void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new SheepFun());
		window.setVisible(true);
	}
}