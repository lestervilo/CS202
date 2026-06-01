import java.awt.*;

public class LittlePrince {
    private Point location;
    private Color clothing;
    private Color hairColor;
    private boolean hasSheep;

    public LittlePrince() {
        location = new Point();
        clothing = Color.GREEN;
        hairColor = Color.YELLOW;
        hasSheep = false;
    }

    public LittlePrince(int x, int y) {
        //call the first constructor to set the deafaults,
        //then update location to (x,y)
        this();
        location = new Point(x, y);
    }

    public LittlePrince(Color c) {
        this();
        clothing = c;
    }

    public LittlePrince(int x, int y, Color c) {
        location = new Point(x, y);
        clothing = c;
        hasSheep = false;
    }

    public void talk() {
        System.out.println("I am the Little Prince. I come from a small asteroid called B612.");
    }

    public void move(int dx, int dy) {
        location.translate(dx, dy);
    }

    public void setClothingColor(Color c) {
        clothing = c;
    }

    public Point getLocation() {
        return location;
    }

    public void draw(Graphics g) {
        //draw the prince's head
		g.setColor(new Color(153,118,88));
		g.fillOval(175+location.x, 100+location.y, 50, 50);
		
		//draw the prince's outfit
		g.setColor(clothing);
		g.fillRect(175+location.x, 150+location.y, 50, 75);
		g.fillRect(175+location.x, 225+location.y, 20, 60);
		g.fillRect(205+location.x, 225+location.y, 20, 60);
    }
}