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
        int x = pos.x;
        int y = pos.y;

        int size = 50;

        // NORTH
        if (exitNorth == null)
        {
            g.drawLine(x, y, x + size, y);
        }
        else
        {
            g.drawLine(x, y, x + 20, y);
            g.drawLine(x + 30, y, x + size, y);
        }

        // SOUTH
        if (exitSouth == null)
        {
            g.drawLine(x, y + size, x + size, y + size);
        }
        else
        {
            g.drawLine(x, y + size, x + 20, y + size);
            g.drawLine(x + 30, y + size, x + size, y + size);
        }

        // WEST
        if (exitWest == null)
        {
            g.drawLine(x, y, x, y + size);
        }
        else
        {
            g.drawLine(x, y, x, y + 20);
            g.drawLine(x, y + 30, x, y + size);
        }

        // EAST
        if (exitEast == null)
        {
            g.drawLine(x + size, y, x + size, y + size);
        }
        else
        {
            g.drawLine(x + size, y, x + size, y + 20);
            g.drawLine(x + size, y + 30, x + size, y + size);
        }
    }
}
