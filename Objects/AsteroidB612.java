import javax.swing.*;
import java.awt.*;

public class AsteroidB612 extends JPanel {
	
	//int dy;
	ImageIcon sheep;
	String[] friends;
	private LittlePrince markham;
	private LittlePrince lester;
	
	public AsteroidB612() {
		markham = new LittlePrince(Color.BLUE);
		lester = new LittlePrince(100, 50, Color.DARK_GRAY);
		sheep = new ImageIcon("sheep.png");
		System.out.println("The Little Prince lives on " + markham.getLocation());
	}

	@Override
	public void paintComponent(Graphics g) {
		var dx = 0;
		//var dy = -100;
		var w = getWidth();
		var h = getHeight();
		
		//draw the inky black background of outer space
		g.setColor(Color.BLACK);
		g.fillRect(0,0,w,h);
		
		//draw the asteroid B612
		g.setColor(Color.GRAY);
		g.fillOval(-200, 250, 800, 800);

		//lester.move(-1, 0);
		markham.draw(g);
		lester.draw(g);
		
		//draw sheep
		sheep.paintIcon(null, g, 0, 200);
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500,500);
		window.setContentPane(new AsteroidB612());
		window.setVisible(true);
	}
}
