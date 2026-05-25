package MethodsLab;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

public class MethodsLab extends JPanel {

    ArrayList<String> instructions;

    public MethodsLab() {
        instructions = new ArrayList<>();

    }

    public void changeColor(int red, int green, int blue, Graphics g) {
        g.setColor(new java.awt.Color(red, green, blue));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new MethodsLab());
        window.setVisible(true);
    }
}
