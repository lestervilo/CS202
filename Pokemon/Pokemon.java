package Pokemon;

import java.awt.*;

import javax.swing.ImageIcon;

public class Pokemon {
    private int hp;
    private Rectangle bounds;
    private String name;
    private ImageIcon picture;

    public Pokemon(String n) {
        hp = 100;
        bounds = new Rectangle();
        name = n;
    }

    public void moveTo (int x, int y) {
        bounds.setLocation(x, y);
    }

    public void setPicture (String filename) {
        picture = new ImageIcon(filename);
        int w = picture.getIconWidth();
        int h = picture.getIconHeight();
        bounds.setSize(w, h);
    }

    public void battle (Pokemon opponent) {
        //TODO: implement battle logic
    }

    public void draw (Graphics g) {
        if(picture != null) {
            picture.paintIcon(null, g, bounds.x, bounds.y);
        }
        g.drawString("I am a Pokemon named " + name + " and I have " + hp + " HP!", bounds.x, bounds.y);
    }

    public void talk () {
        IO.println("I am a Pokemon named " + name + " and I have " + hp + " HP!");
    }

    public String greeting () {
        return "I am a Pokemon named " + name + " and I have " + hp + " HP!";
    }
}