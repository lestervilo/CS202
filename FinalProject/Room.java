package FinalProject;

import java.awt.Graphics;
import java.awt.Point;

public class Room {
    private Point pos;

    private Room exitEast;
    private Room exitWest;
    private Room exitNorth;
    private Room exitSouth;

    public Room(int x, int y) {
        pos = new Point(x, y);

        exitEast = null;
        exitWest = null;
        exitNorth = null;
        exitSouth = null;
    }

    public void setEastExit(Room r) {
        exitEast = r;
        r.exitWest = this;
    }

    public void setWestExit(Room r) {
        exitWest = r;
        r.exitEast = this;
    }

    public void setNorthExit(Room r) {
        exitNorth = r;
        r.exitSouth = this;
    }

    public void setSouthExit(Room r) {
        exitSouth = r;
        r.exitNorth = this;
    }

    public void draw(Graphics g) {
        int x = pos.x; // X position of the room
        int y = pos.y; // Y position of the room
        int size = 50; // Size of the room
        int doorStart = 20; // Starting point of the door opening
        int doorEnd = 30; // Ending point of the door opening

        // NORTH
        if (exitNorth == null)
        {
            g.drawLine(x, y, x + size, y); // Draw the full wall
        }
        else
        {
            g.drawLine(x, y, x + doorStart, y); // Draw left part of the wall
            g.drawLine(x + doorEnd, y, x + size, y); // Draw right part of the wall
        }

        // SOUTH
        if (exitSouth == null)
        {
            g.drawLine(x, y + size, x + size, y + size); // Draw the full wall
        }
        else
        {
            g.drawLine(x, y + size, x + doorStart, y + size); // Draw left part of the wall
            g.drawLine(x + doorEnd, y + size, x + size, y + size); // Draw right part of the wall

            //Draw the hallway between the rooms
            g.drawLine(x + 30, y + 50, x + 20, y + 60);
            g.drawLine(x + 30, y + 50, x + 30, y + 60);
        }

        // WEST
        if (exitWest == null)
        {
            g.drawLine(x, y, x, y + size); // Draw the full wall
        }
        else
        {
            g.drawLine(x, y, x, y + doorStart); // Draw upper part of the wall
            g.drawLine(x, y + doorEnd, x, y + size); // Draw lower part of the wall
        }

        // EAST
        if (exitEast == null)
        {
            g.drawLine(x + size, y, x + size, y + size); // Draw the full wall
        }
        else
        {
            g.drawLine(x + size, y, x + size, y + doorStart); // Draw upper part of the wall
            g.drawLine(x + size, y + doorEnd, x + size, y + size); // Draw lower part of the wall

            //Draw the hallway between the rooms
            g.drawLine(x + 50, y + 20, x + 60, y + 20);
            g.drawLine(x + 50, y + 30, x + 60, y + 30);
        }
    }
}
