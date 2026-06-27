package FinalProject2;

import javax.swing.*;
import java.awt.*;
import java.util.*;

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
        bounds.setSize(imgHeight, imgWidth);
    }

    public void setLocation(int x, int y) {
        this.bounds = new Rectangle(x,y);
    }


    public void offset(int dx, int dy) {
        bounds.translate(dx, dy);
    }

    public void draw(Graphics g) {
        if(img != null) {
            img.paintIcon(null, g, bounds.x, bounds.y);
        }
    }

    public boolean touches(Sprite other) {
        return (this != other && this.bounds.intersects(other.bounds));
    }
} 
