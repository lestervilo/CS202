package FinalProject2;

import javax.swing.*;

import FinalProject.Maze;

import java.awt.*;
import java.util.*;

public class Main extends JPanel{
    private ArrayList<Sprite> arr;

    public Main() {
        arr = new ArrayList<>();
        spaceship();
    }

    private void spaceship() {
        Random rand = new Random();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);

        g.setColor(Color.GREEN);
        g.fillRect(0, 500, 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Space");
        Maze maze = new Maze();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(maze);
        frame.setVisible(true);
    }
}
