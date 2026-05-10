import javax.swing.ImageIcon;
import java.awt.Point;
import java.awt.Graphics;
import java.util.Random;

public abstract class Pokemon {
    
    // Step 1: Private fields
    private ImageIcon image;
    private Point location;
    private int id;

    // Steps 2 & 3: Constructor
    public Pokemon(int id) {
        Random rand = new Random();
        
        // Initialize the Point field to a random x,y between 0 and 800
        int x = rand.nextInt(801); // 801 ensures it can go up to 800 inclusive
        int y = rand.nextInt(801);
        this.location = new Point(x, y);
        
        // Assign the passed-in ID to the field
        this.id = id;
    }

    // Step 4: setImage method
    public void setImage(String filename) {
        // Treats the String as a filename to initialize the ImageIcon field
        this.image = new ImageIcon(filename);
    }

    // Step 5: draw method
    public void draw(Graphics g) {
        // Render the ImageIcon at the location specified by the Point
        if (this.image != null) {
            this.image.paintIcon(null, g, this.location.x, this.location.y);
        }
        
        // Print the ID number next to or in front of the image. 
        // We add a slight offset (e.g., + 15) so the text doesn't completely overlap the top-left of the image.
        g.drawString(String.valueOf(this.id), this.location.x, this.location.y + 15);
    }
    
    // Step 6: Additional helpful methods
    // You will definitely need a getter for the ID later when you implement 
    // the keyboard events to check which Pokemon to remove!
    public int getId() {
        return this.id;
    }
}