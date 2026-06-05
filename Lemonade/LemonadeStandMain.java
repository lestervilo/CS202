package Lemonade;

import javax.swing.*;
import java.awt.*;

public class LemonadeStandMain extends JPanel {

    //Fields
    private LemonadeStand stand1;
    private LemonadeStand stand2;

    //Constructors
    public LemonadeStandMain() {
        stand1 = new LemonadeStand();
        stand2 = new LemonadeStand(300,20);
        stand2.setSignColor(Color.PINK);
    }

    public LemonadeStandMain(int x, int y, Color c){

    }

    //methods
    @Override
    public void paintComponent(Graphics g) {
		//The background
        g.setColor(Color.BLUE);
        var h = getHeight();
        var w = getWidth();
        var dx = 0;
        var dy = -50;
        g.fillRect(0, 0, w, h);

        //The grass
        g.setColor(Color.GREEN);
        g.fillRect(0, 500, w, 200);

        //The moon in top left corner
        g.setColor(Color.YELLOW);
        g.fillOval(20, 20, 80, 80);

        stand1.draw(g);
        stand2.draw(g);
    }


    //Main
    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new LemonadeStandMain());
        window.setSize(900,730);
        window.setVisible(true);
    }
}
