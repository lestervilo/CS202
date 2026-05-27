package Asteroid;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.ImageIcon;

public class AsteroidB612 extends JPanel {

	String[] friends;
	ImageIcon sheep;
	int dy;

	public AsteroidB612() {
		//Your custom initialization code here
		dy = 0;
		sheep = new ImageIcon("sheep.png");
		String data = "The Rose, The Snake, The Lamplighter, The Businessman, The Geographer";
		friends = data.split(",");
		friends[2] = "The Fox";
		/*for (int i = 0; i < friends.length; i++) {
			System.out.println(i + ": " + friends[i]);
		}
		for(var f : friends) {
			System.out.println(f + " is a friend of the Little Prince.");
		}*/
		int i = 0;
		/*while(i < friends.length) {
			System.out.println(i + ": " + friends[i]);
			i++;
		}*/
		do {
			System.out.println(i + ": " + friends[i]);
			i++;
		} while(i < friends.length);
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

		sheep.paintIcon(this, g, 150+dx, 300+dy);
	}

	void main() {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new AsteroidB612());
		window.setVisible(true);
	}
}
