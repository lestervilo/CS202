package Pokemon;

import java.awt.*;
import javax.swing.*;

public class FunWithPokemon extends JPanel {

    private Charmander marksCharmander;
    private Pichu tomsPichu;
    private Pokemon another;

    public FunWithPokemon() {
        marksCharmander = new Charmander("Charmander");
        marksCharmander.moveTo(100, 100);
        tomsPichu = new Pichu();
        tomsPichu.moveTo(300, 300);
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
