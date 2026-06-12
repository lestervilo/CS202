package FinalProject;

import javax.swing.*;
import java.awt.*;

public class Maze extends JPanel {
    private Room[][] rooms;

    public Maze() {
        rooms = new Room[4][4]; // 4x4 grid of rooms

        int startX = 50; // Starting X position for the first room
        int startY = 50; // Starting Y position for the first room
        int spacing = 60; // Space between rooms (including room size and gap)

        // Create 16 rooms
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 4; col++)
            {
                rooms[row][col] = new Room(startX + col * spacing, startY + row * spacing); // Create a room at the appropriate position
            }
        }

        // Example maze connections

        rooms[0][0].setEastExit(rooms[0][1]);
        rooms[0][1].setEastExit(rooms[0][2]);
        rooms[0][2].setSouthExit(rooms[1][2]);

        rooms[1][0].setSouthExit(rooms[2][0]);
        rooms[1][0].setEastExit(rooms[1][1]);
        rooms[2][0].setEastExit(rooms[2][1]);
        rooms[1][2].setWestExit(rooms[1][1]);
        rooms[1][1].setSouthExit(rooms[2][1]);

        rooms[2][1].setEastExit(rooms[2][2]);
        rooms[2][2].setEastExit(rooms[2][3]);

        rooms[2][3].setSouthExit(rooms[3][3]);
        rooms[3][3].setWestExit(rooms[3][2]);
        rooms[3][2].setWestExit(rooms[3][1]);
        rooms[3][1].setNorthExit(rooms[2][1]);
        rooms[2][0].setSouthExit(rooms[3][0]);

        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw all rooms
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                rooms[row][col].draw(g);
            }
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Laban's Fortress");
        Maze maze = new Maze();
        frame.add(maze);
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(maze);
        frame.setVisible(true);
    }
}
