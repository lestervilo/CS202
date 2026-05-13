package Asteroid;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class AsteroidB612 extends JPanel {
	
	public AsteroidB612() {
		//Your custom initialization code here
		dy = 0;
		sheep = new ImageIcon("sheep.png");
		String data = "The Rose, The Snake, The Lamplighter, The Businessman, The Geographer";
		friends = data.split(",");
		friends[2] = "The Fox";
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ": " + friends[i]);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		var dx = 50;
		var dy = -100;
		g.setColor(Color.BLACK);
		g.fillRect(0,0,400,400);
		
		g.setColor(Color.GRAY);
		g.fillOval(-200, 250, 800, 800);
		
		g.setColor(new Color(153,118,88));
		g.fillOval(175+dx, 100+dy, 50, 50);
		
		g.setColor(Color.GREEN);
		g.fillRect(175+dx, 150+dy, 50, 75);
		g.fillRect(175+dx, 225+dy, 20, 60);
		g.fillRect(205+dx, 225+dy, 20, 60);
	}

	void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new AsteroidB612());
		window.setVisible(true);
	}
}
