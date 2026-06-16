package Pokemon;

import java.awt.*;

import javax.swing.ImageIcon;

public abstract class Pokemon {
    private int hp;
    private Rectangle bounds;
    private String name;
    private ImageIcon picture;

    public Pokemon(String n) {
        hp = 100;
        bounds = new Rectangle();
        name = n;
    }

    public Pokemon(String n, int h) {
        this(n);
        hp = h;
    }

    public void moveTo (int x, int y) {
        bounds.setLocation(x, y);
    }

    public void moveBy (int dx, int dy) {
        bounds.translate(dx, dy);
    }

    public void setPicture (String filename) {
        picture = new ImageIcon(filename);
        int w = picture.getIconWidth();
        int h = picture.getIconHeight();
        bounds.setSize(w, h);
    }

    public void battle (Pokemon opponent) {
    }

    public void draw (Graphics g) {
        if(picture != null) {
            picture.paintIcon(null, g, bounds.x, bounds.y);
        }
        g.drawString(greeting(), bounds.x, bounds.y);
    }

    public void talk () {
        IO.println(greeting());
    }

    public abstract String greeting ();

    public boolean contains (int x, int y) {
        return bounds.contains(x, y);
    }
}