package MethodsLab;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MethodsLab extends JPanel {

    ArrayList<String> instructions;

    public MethodsLab() {
        instructions = new ArrayList<>();

        try {
            String filename = JOptionPane.showInputDialog("Enter filename:");

        File file = new File(filename);
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            instructions.add(input.nextLine());
        }

        input.close();

    } catch (Exception e) {
        System.out.println("Error reading file: " + e.getMessage());
    }

    public void changeColor(int red, int green, int blue, Graphics g) {
        Color newColor = new Color(red, green, blue);
        g.setColor(newColor);
    }

    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }

    public void drawCircle(int xc, int yc, int r, Graphics g) {
        int x = xc - r;
        int y = yc - r;

        g.drawOval(x, y, r * 2, r * 2);
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


