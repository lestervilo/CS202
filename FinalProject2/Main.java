package FinalProject2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class Main extends JPanel implements KeyListener{
    private ArrayList<Sprite> arr;
    private Sprite spaceShip;
    private Sprite asteroid1;
    private Sprite asteroid2;
    private Sprite asteroid3;
    private Sprite asteroid4;
    private Sprite asteroid5;
    private Sprite asteroid6;

    public Main() {
        arr = new ArrayList<Sprite>();
        asteroid1.add("Asteroid");
        asteroid2.add("Asteroid");
        asteroid3.add("Asteroid");
        asteroid4.add("Asteroid");
        asteroid5.add("Asteroid");
        spaceShip.add("Spaceship");

    }

    public void arr(int x, int y) {
        Sprite asteroid1 = new Main(5,5);
        arr asteroid2 = new Main(5,5);
        arr asteroid3 = new Main(5,5);
        arr asteroid4 = new Main(5,5);
        arr asteroid5 = new Main(5,5);
        arr spaceShip = new Main(5,5);
    }

    private void spaceship() {
        Random rand = new Random();

        setFocusable(true);
        addKeyListener(this);

    }

    private void asteroid() {
        Random rand = new Random();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        requestFocusInWindow();

        setBackground(Color.BLACK);

        //landingpad
        g.setColor(Color.GREEN);
        g.fillRect(250, 690, 300, 50);

        g.setColor(Color.GRAY);
        g.fillRect(100, 730, 600, 50);

        asteroid1.draw(g);
        asteroid2.draw(g);
        asteroid3.draw(g);
        asteroid4.draw(g);
        asteroid5.draw(g);
        asteroid6.draw(g);
        spaceShip.draw(g);

        for (Sprite d : arr) {
            d.arr(g);
    }

    private void reset() {
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) spaceship(5,5);
        if (key == KeyEvent.VK_DOWN) spaceship(5,5);
        if (key == KeyEvent.VK_LEFT) spaceship(-5,5);
        if (key == KeyEvent.VK_RIGHT) spaceship(5,5);

        if (spaceShip.bounds() == asteroid.bounds()) {
            JOptionPane.showMessageDialog(this, "You lose! Try again!");
            reset();
        }

        if (spaceship.bounds() == green.bounds()) {
            JOptionPane.showMessageDialog(this, "You win!");
            reset();
        }

        if (key == KeyEvent.VK_R) reset();

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Main());
        frame.setVisible(true);
    }
}
