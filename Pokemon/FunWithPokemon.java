package Pokemon;

import java.awt.*;
import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class FunWithPokemon extends JPanel implements MouseListener, MouseMotionListener {

    private Charmander marksCharmander;
    private Pichu tomsPichu;
    private Bulbasaur lester;
    private ArrayList<Pokemon> pokemonList;
    private Pokemon selected;
    private Point previousxy;

    public FunWithPokemon() {
        addMouseListener(this);
        addMouseMotionListener(this);
        marksCharmander = new Charmander("Charmander");
        marksCharmander.moveTo(100, 100);
        tomsPichu = new Pichu();
        tomsPichu.moveTo(400, 200);
        lester = new Bulbasaur("Bulby");
        lester.moveTo(700, 400);
        pokemonList = new ArrayList<>();
        pokemonList.add(marksCharmander);
        pokemonList.add(tomsPichu);
        pokemonList.add(lester);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        marksCharmander.draw(g);
        tomsPichu.draw(g);
        lester.draw(g);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Fun with Pokemon");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000, 600);
        window.setContentPane(new FunWithPokemon());
        window.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
        int x = e.getX();
        int y = e.getY();
        for (var p : pokemonList) {
            if (p.contains(x, y)) {
                p.talk();
                selected = p;
                previousxy = new Point(x, y);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        int dx = e.getX() - previousxy.x;
        int dy = e.getY() - previousxy.y;
        selected.moveBy(dx, dy);
        previousxy = new Point(e.getX(), e.getY());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {}
}
