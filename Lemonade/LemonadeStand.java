package Lemonade;


import java.awt.*;

public class LemonadeStand {

    //Fields
    private Point pos;
    private Color signColor;
    private Color textColor;

    //Constructors
    public LemonadeStand(){
        pos = new Point();
        signColor = Color.MAGENTA;
        textColor = Color.BLACK;
    }

    public LemonadeStand(int x, int y) {
        pos = new Point(x,y);
        signColor = Color.BLACK;
        textColor = Color.WHITE;
    }

    //Methods
    public void setTextColor(Color c) {
        textColor = c;
    }

    public void setSignColor(Color c) {
        signColor = c;
    }

    public void draw(Graphics g) {
        //The stars in the sky
        g.setColor(Color.WHITE);
        g.fillOval(150, 50, 10, 10);
        g.fillOval(200, 80, 10, 10);
        g.fillOval(300, 30, 10, 10);
        g.fillOval(400, 60, 10, 10);
        g.fillOval(500, 40, 10, 10);

        //The table of the lemonade stand
        g.setColor(Color.ORANGE);
        g.fillRect(160+pos.x, 370+pos.y, 250, 130);

        //The two stand of the lemonade stand
        g.setColor(Color.RED);
        g.fillRect(170+pos.x, 245+pos.y, 20, 125);
        g.fillRect(378+pos.x, 245+pos.y, 20, 125);

        //The banner of the lemonade stand
        g.setColor(signColor);
        g.fillRect(160+pos.x, 170+pos.y, 250, 130);

        //The text on the banner
        g.setColor(textColor);
        g.drawString("LEMONADE : $1.00", 228+pos.x, 280+pos.y);

        //The LOGO of the lemonade stand LV's
        g.setColor(Color.YELLOW);

        //L
        g.drawLine(200+pos.x, 190+pos.y, 200+pos.x, 250+pos.y);
        g.drawLine(200+pos.x, 250+pos.y, 230+pos.x, 250+pos.y);

        //Circle
        g.drawOval(245+pos.x, 180+pos.y, 70, 70);
        g.fillOval(245+pos.x, 180+pos.y, 70, 70);

        //Apostrophe
        g.drawLine(330+pos.x, 185+pos.y, 330+pos.x, 200+pos.y);
        g.drawLine(330+pos.x, 200+pos.y, 322+pos.x, 210+pos.y);

        //S
        g.drawLine(340+pos.x, 220+pos.y, 360+pos.x, 220+pos.y);
        g.drawLine(340+pos.x, 220+pos.y, 340+pos.x, 235+pos.y);
        g.drawLine(340+pos.x, 235+pos.y, 360+pos.x, 235+pos.y);
        g.drawLine(360+pos.x, 235+pos.y, 360+pos.x, 250+pos.y);
        g.drawLine(360+pos.x, 250+pos.y, 340+pos.x, 250+pos.y);

        //V
        g.setColor(Color.BLACK);
        g.drawLine(250+pos.x, 190+pos.y, 280+pos.x, 250+pos.y);
        g.drawLine(310+pos.x, 190+pos.y, 280+pos.x, 250+pos.y);

        //The glass of lemonade
        g.setColor(Color.CYAN);
        g.fillRect(210+pos.x, 330+pos.y, 20, 40);
        g.fillRect(250+pos.x, 330+pos.y, 20, 40);
        g.fillRect(290+pos.x, 330+pos.y, 20, 40);
        g.fillRect(330+pos.x, 330+pos.y, 20, 40);
        g.setColor(Color.WHITE);
        g.fillRect(210+pos.x, 330+pos.y, 20, 10);
        g.fillRect(250+pos.x, 330+pos.y, 20, 10);
        g.fillRect(290+pos.x, 330+pos.y, 20, 10);
        g.fillRect(330+pos.x, 330+pos.y, 20, 10);

        //Airplane in the sky with the banner "Go Seasiders!"
        g.setColor(Color.GRAY);
        g.fillRoundRect(400+pos.x, 100+pos.y, 60, 20, 30, 10);
        g.fillRect(410+pos.x, 90+pos.y, 10, 40);
        g.fillRect(450+pos.x, 90+pos.y, 10, 40);
        g.setColor(Color.GRAY);
        g.fillRect(470+pos.x, 90+pos.y, 90, 40);
        g.setColor(Color.WHITE);
        g.drawString("Go Seasiders!", 480+pos.x, 115+pos.y);
        g.drawLine(450+pos.x, 110+pos.y, 470+pos.x, 110+pos.y);

        //Clouds in the sky
        g.setColor(Color.WHITE);
        g.fillOval(50+pos.x, 50+pos.y, 60, 40);
        g.fillOval(80+pos.x, 50+pos.y, 60, 40);
        g.fillOval(110+pos.x, 50+pos.y, 60, 40);
        g.fillOval(60+pos.x, 30+pos.y, 60, 40);

        //and more clouds in the sky
        g.fillOval(350+pos.x, 50+pos.y, 60, 40);
        g.fillOval(380+pos.x, 50+pos.y, 60, 40);
        g.fillOval(410+pos.x, 50+pos.y, 60, 40);
        g.fillOval(360+pos.x, 30+pos.y, 60, 40);

        //3rd cloud in the sky
        g.fillOval(250+pos.x, 50+pos.y, 60, 40);
        g.fillOval(280+pos.x, 50+pos.y, 60, 40);
        g.fillOval(260+pos.x, 30+pos.y, 60, 40);
	}
}
