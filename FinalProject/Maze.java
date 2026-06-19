package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Maze extends JPanel implements KeyListener {
    private Room[][] rooms; //Object reference to the 2D array of rooms

    private Laban laban;
    private Nephi nephi;
    private Sword sword;
    private Plates plates;

    public Maze() {
        rooms = new Room[4][4];

        int startX = 50;
        int startY = 50;
        int spacing = 60;

        // Create 16 rooms
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 4; col++)
            {
                rooms[row][col] = new Room(startX + col * spacing, startY + row * spacing);
            }
        }

        // Example maze connections

        rooms[0][0].setEastExit(rooms[0][1]);
        rooms[0][1].setEastExit(rooms[0][2]);
        rooms[0][2].setEastExit(rooms[0][3]);
        rooms[0][1].setSouthExit(rooms[1][1]);

        rooms[1][0].setEastExit(rooms[1][1]);
        rooms[1][2].setWestExit(rooms[1][1]);
        rooms[1][1].setSouthExit(rooms[2][1]);
        rooms[1][2].setSouthExit(rooms[2][2]);

        rooms[2][0].setSouthExit(rooms[3][0]);
        rooms[2][0].setEastExit(rooms[2][1]);
        rooms[2][1].setEastExit(rooms[2][2]);
        rooms[2][3].setSouthExit(rooms[3][3]);
        rooms[2][3].setNorthExit(rooms[1][3]);

        rooms[3][3].setWestExit(rooms[3][2]);
        rooms[3][2].setWestExit(rooms[3][1]);
        rooms[3][2].setNorthExit(rooms[2][2]);

        // Create characters and items
        nephi = new Nephi();
        laban = new Laban();
        sword = new Sword();
        plates = new Plates();

        // Place characters and items in rooms
        nephi.setCurrentRoom(rooms[3][0]);
        laban.setCurrentRoom(rooms[0][2]);
        sword.setCurrentRoom(rooms[1][3]);
        plates.setCurrentRoom(rooms[0][3]);

        setBackground(Color.LIGHT_GRAY);

        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        requestFocusInWindow();

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                rooms[row][col].draw(g);
            }
        }

        // Draw characters and items
        nephi.draw(g);
        laban.draw(g);
        sword.draw(g);
        plates.draw(g);
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // Nephi
        if (key == KeyEvent.VK_UP) nephi.moveNorth();
        if (key == KeyEvent.VK_DOWN) nephi.moveSouth();
        if (key == KeyEvent.VK_LEFT) nephi.moveWest();
        if (key == KeyEvent.VK_RIGHT) nephi.moveEast();

        // Laban
        if (key == KeyEvent.VK_W) laban.moveNorth();
        if (key == KeyEvent.VK_S) laban.moveSouth();
        if (key == KeyEvent.VK_A) laban.moveWest();
        if (key == KeyEvent.VK_D) laban.moveEast();

        repaint();
    }

    public void keyReleased(KeyEvent e){}

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Laban's Fortress");
        Maze maze = new Maze();
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(maze);
        frame.setVisible(true);
    }
}
