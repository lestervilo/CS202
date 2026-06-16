package FinalProject;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.ImageIcon;

public class Sprite {
    protected Room currentRoom;
    protected ImageIcon image;

    public Sprite() {
        currentRoom = null;
        image = null;
    }

    public void setCurrentRoom(Room r) {
        currentRoom = r;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void draw(Graphics g) {
        if (currentRoom == null) return;

        Point pos = currentRoom.getPosition();
        int roomSize = 50;

        int imgWidth = image.getIconWidth();
        int imgHeight = image.getIconHeight();
        int drawX = pos.x + (roomSize - imgWidth) / 2;
        int drawY = pos.y + (roomSize - imgHeight) / 2;

        image.paintIcon(null, g, drawX, drawY);
    }
}
