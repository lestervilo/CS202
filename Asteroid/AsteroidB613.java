package Asteroid;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
// import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class AsteroidB613 extends JPanel {

	int dy;
	ImageIcon sheep;
	String[] friends;

	public AsteroidB613() {
		//Your custom initialization code here
		//String maua = JOptionPane.showInputDialog("Please enter a DY value for the Little Prince.");
		//dy = Integer.parseInt(maua);
		dy = 0;
		sheep = new ImageIcon("sheep.png");
	}

	public void drawLittlePrince(Graphics g, int dx, int dy) {
		//draw the prince head
		g.setColor(new Color(153,118,88));
		g.fillOval(175+dx, 100+dy, 50, 50);

		//draw the prince's outfit.
		g.setColor(Color.GREEN);
		g.fillRect(175+dx, 150+dy, 50, 75);
		g.fillRect(175+dx, 225+dy, 20, 60);
		g.fillRect(205+dx, 225+dy, 20, 60);
	}

	public void drawLittlePrince(Graphics g, int dx, int dy, Color tunic) {
		//draw the prince head
		g.setColor(new Color(153,118,88));
		g.fillOval(175+dx, 100+dy, 50, 50);

		//draw the prince's outfit.
		g.setColor(tunic);
		g.fillRect(175+dx, 150+dy, 50, 75);
		g.fillRect(175+dx, 225+dy, 20, 60);
		g.fillRect(205+dx, 225+dy, 20, 60);

	}	

	public void printSheep(Graphics g, int x, int y) {
		//Draw sheep
		sheep.paintIcon(null, g, x, y);
	}

	@Override
	public void paintComponent(Graphics g) {
	//var dx = 0;
	//var dy = -100;
	var w = getWidth();
	var h = getHeight();

	//draw the inky black background of outerspace
	g.setColor(Color.BLACK);
	g.fillRect(0,0,w,h);

	//Draw the asteroid.
	g.setColor(Color.GRAY);
	g.fillOval(-200, 250, 800, 800);

	// //Draw sheep
	// sheep.paintIcon(null, g, 0, 200);

	drawLittlePrince(g, 0, 0);
	drawLittlePrince(g, 0, 0, Color.BLUE);
	drawLittlePrince(g, 0, 0, Color.RED);
	printSheep(g, 0, 200);
	printSheep(g, 200, 200);

	g.setColor(Color.WHITE);
	if (dy < -30) {
		g.drawString("The prince is floating away!", 50, 50);
	} else {
		g.drawString("The prince is safely on the ground.", 50, 50);
	}

	}

	public static void main(String[] args) {
	var window = new JFrame();
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(400,400);
	window.setContentPane(new AsteroidB613());
	window.setVisible(true);
	}
}