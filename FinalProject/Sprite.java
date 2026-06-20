package FinalProject;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.ImageIcon;

public abstract class Sprite implements Drawable {
    protected Room currentRoom;
    protected ImageIcon image;

    // Constructor
    public Sprite() {
        currentRoom = null;
        image = null;
    }

    // Assigns the room where this sprite will be drawn
    public void setCurrentRoom(Room r) {
        currentRoom = r;
    }

    // Returns the room this sprite is currently in
    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void moveSouth() {
        if (currentRoom.hasSouthExit()) {
            currentRoom = currentRoom.getSouthExit();
        }
    }

    public void moveNorth() {
        if (currentRoom.hasNorthExit()) {
            currentRoom = currentRoom.getNorthExit();
        }
    }

    public void moveEast() {
        if (currentRoom.hasEastExit()) {
            currentRoom = currentRoom.getEastExit();
        }
    }

    public void moveWest() {
        if (currentRoom.hasWestExit()) {
            currentRoom = currentRoom.getWestExit();
        }
    }

    public void draw(Graphics g) {
        // Safety check — don't draw if no room is assigned
        if (currentRoom == null) return;

        // Get the room's top-left corner position
        Point pos = currentRoom.getPosition();
        int roomSize = 50;

        // Measure the image dimensions
        int imgWidth = image.getIconWidth();
        int imgHeight = image.getIconHeight();

        // Calculate centered position inside the room
        int drawX = pos.x + (roomSize - imgWidth) / 2;
        int drawY = pos.y + (roomSize - imgHeight) / 2;

        // Paint the image at the centered position
        image.paintIcon(null, g, drawX, drawY);
    }
}
