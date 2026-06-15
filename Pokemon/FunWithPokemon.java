package Pokemon;

import java.awt.*;
import javax.swing.*;

public class FunWithPokemon extends JPanel {

    private Charmander marksCharmander;
    private Pichu tomsPichu;
    private Pokemon another;
    private Pokemon yetAnother;
    private Pokemon andAnother;
    private Bulbasaur bulbasaur;

    public FunWithPokemon() {
        marksCharmander = new Charmander("Charmander");
        marksCharmander.moveTo(100, 100);
        tomsPichu = new Pichu();
        tomsPichu.moveTo(300, 300);
        another = tomsPichu; // another is a reference to the same Pokemon as tomsPichu
        yetAnother = new Pichu("Sparky", 40); // yetAnother is a reference to a different Pokemon than tomsPichu
        yetAnother.moveTo(200, 200);
        andAnother = yetAnother; // andAnother is a reference to the same Pokemon as yetAnother
        andAnother.moveTo(500, 100);
        bulbasaur = new Bulbasaur("Bulby");
        bulbasaur.moveTo(700, 400);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        marksCharmander.draw(g);
        tomsPichu.draw(g);
        another.draw(g);
        yetAnother.draw(g);
        andAnother.draw(g);
        bulbasaur.draw(g);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Fun with Pokemon");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000, 600);
        window.setContentPane(new FunWithPokemon());
        window.setVisible(true);
    }
}
