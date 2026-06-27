package FinalProject2;

import javax.swing.*;
import java.awt.*;

public abstract class Sprite {
    private ImageIcon img;
    private Rectangle bounds;

    public Sprite() {
        bounds = new Rectangle();
    }

    //methods
    public void setImage(String filename) {
        img = new ImageIcon();
        int imgWidth = img.getIconWidth();
        int imgHeight = img.getIconHeight();
    }

    public void setLocation(int x, int y) {
        this.bounds = new Rectangle(x,y);
    }

    public void offset(int dx, int dy) {

    }

    public void draw(Graphics g) {
        
    }

    public boolean touches(Sprite other) {
        return (this != other && this.bounds.intersects(other.bounds));
    }
} 
