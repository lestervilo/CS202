package Lemonade;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Lemonade extends JPanel {
	
	public Lemonade() {
		//Your custom initialization code here
	}

	@Override
	public void paintComponent(Graphics g) {
		//The background
        g.setColor(Color.BLUE);
        var h = getHeight();
        var w = getWidth();
        var dx = 0;
        var dy = -50;
        g.fillRect(0, 0, w, h);

        //The grass
        g.setColor(Color.GREEN);
        g.fillRect(0, 500, w, 200);

        //The moon in top left corner
        g.setColor(Color.YELLOW);
        g.fillOval(20, 20, 80, 80);

        //The stars in the sky
        g.setColor(Color.WHITE);
        g.fillOval(150, 50, 10, 10);
        g.fillOval(200, 80, 10, 10);
        g.fillOval(300, 30, 10, 10);
        g.fillOval(400, 60, 10, 10);
        g.fillOval(500, 40, 10, 10);

        //The table of the lemonade stand
        g.setColor(Color.ORANGE);
        g.fillRect(dx+160, dy+370, 250, 130);

        //The two stand of the lemonade stand
        g.setColor(Color.RED);
        g.fillRect(dx+170, dy+245, 20, 125);
        g.fillRect(dx+378, dy+245, 20, 125);

        //The banner of the lemonade stand
        g.setColor(Color.MAGENTA);
        g.fillRect(dx+160, dy+170, 250, 130);

        //The text on the banner
        g.setColor(Color.BLACK);
        g.drawString("LEMONADE : $1.00", dx+228, dy+280);

        //The LOGO of the lemonade stand LV's
        g.setColor(Color.YELLOW);

        //L
        g.drawLine(dx+200, dy+190, dx+200, dy+250);
        g.drawLine(dx+200, dy+250, dx+230, dy+250);

        //Circle
        g.drawOval(dx+245, dy+180, 70, 70);
        g.fillOval(dx+245, dy+180, 70, 70);

        //Apostrophe
        g.drawLine(dx+330, dy+185, dx+330, dy+200);
        g.drawLine(dx+330, dy+200, dx+322, dy+210);

        //S
        g.drawLine(dx+340, dy+220, dx+360, dy+220);
        g.drawLine(dx+340, dy+220, dx+340, dy+235);
        g.drawLine(dx+340, dy+235, dx+360, dy+235);
        g.drawLine(dx+360, dy+235, dx+360, dy+250);
        g.drawLine(dx+360, dy+250, dx+340, dy+250);

        //V
        g.setColor(Color.BLACK);
        g.drawLine(dx+250, dy+190, dx+280, dy+250);
        g.drawLine(dx+310, dy+190, dx+280, dy+250);

        //The glass of lemonade
        g.setColor(Color.CYAN);
        g.fillRect(dx+210, dy+330, 20, 40);
        g.fillRect(dx+250, dy+330, 20, 40);
        g.fillRect(dx+290, dy+330, 20, 40);
        g.fillRect(dx+330, dy+330, 20, 40);
        g.setColor(Color.WHITE);
        g.fillRect(dx+210, dy+330, 20, 10);
        g.fillRect(dx+250, dy+330, 20, 10);
        g.fillRect(dx+290, dy+330, 20, 10);
        g.fillRect(dx+330, dy+330, 20, 10);

        //Airplane in the sky with the banner "Go Seasiders!"
        g.setColor(Color.GRAY);
        g.fillRoundRect(400, 100, 60, 20, 30, 10);
        g.fillRect(410, 90, 10, 40);
        g.fillRect(450, 90, 10, 40);
        g.setColor(Color.GRAY);
        g.fillRect(470, 90, 90, 40);
        g.setColor(Color.WHITE);
        g.drawString("Go Seasiders!", 480, 115);
        g.drawLine(450, 110, 470, 110);

        //Clouds in the sky
        g.setColor(Color.WHITE);
        g.fillOval(50, 50, 60, 40);
        g.fillOval(80, 50, 60, 40);
        g.fillOval(110, 50, 60, 40);
        g.fillOval(60, 30, 60, 40);

        //and more clouds in the sky
        g.fillOval(350, 50, 60, 40);
        g.fillOval(380, 50, 60, 40);
        g.fillOval(410, 50, 60, 40);
        g.fillOval(360, 30, 60, 40);

        //3rd cloud in the sky
        g.fillOval(250, 50, 60, 40);
        g.fillOval(280, 50, 60, 40);
        g.fillOval(260, 30, 60, 40);
	}

	void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600,600);
		window.setContentPane(new Lemonade());
		window.setVisible(true);
	}
}