package Pokemon;

import java.awt.*;
import javax.swing.*;

public class FunWithPokemon extends JPanel {

    private Pokemon marksCharmander;
    private Pokemon tomsPichu;
    private Pokemon another;

    public FunWithPokemon() {
        marksCharmander = new Pokemon("Charmander");
        marksCharmander.moveTo(100, 100);
        marksCharmander.setPicture("charmander.png");
        tomsPichu = new Pokemon("Pichu");
        tomsPichu.moveTo(300, 300);
        tomsPichu.setPicture("pichu.png");
        another = tomsPichu; // another is a reference to the same Pokemon as tomsPichu
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        marksCharmander.draw(g);
        tomsPichu.draw(g);
        another.draw(g);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Fun with Pokemon");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 600);
        window.setContentPane(new FunWithPokemon());
        window.setVisible(true);
    }
}
