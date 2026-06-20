package FinalProject;

import javax.swing.ImageIcon;

public class Nephi extends Sprite {

    private boolean hasSword;
    private ImageIcon normalIcon;
    private ImageIcon armedIcon;

    public Nephi() {
        // Constructor for Nephi class
        super();
        normalIcon = new ImageIcon("nephi.png");
        armedIcon = new ImageIcon("nephi_sword.png");
    }

    public void pickUpSword() {
        hasSword = true;
        image = armedIcon;
    }

    public boolean isArmed() {
        return hasSword;
    }

    public void reset() {
        hasSword = false;
        image = normalIcon;
    }
}
