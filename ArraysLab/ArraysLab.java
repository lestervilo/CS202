package ArraysLab;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArraysLab extends JPanel {

    String file;

    public ArraysLab() {
        file = JOptionPane.showInputDialog("Enter the name of the file to read:");
            /* cis202.txt
               happyface.txt 
               square.txt
               super.txt
               triangles.txt*/
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            //Open and read the number in the file.
            Scanner box = new Scanner(new File(file));
            
            int w = box.nextInt();
            int h = box.nextInt();

            while (box.hasNextInt()) {
                //This line reads the first number of each shape.
                int num = box.nextInt();

                //Arrays are created here.
                int[] x = new int[num];
                int[] y = new int[num];

                    for (int i = 0; i < num; i++) {
                        x[i] = box.nextInt();
                        y[i] = box.nextInt();
                    }
                g.drawPolygon(x, y, num);
            }
            box.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Arrays Lab");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new ArraysLab());
        window.setVisible(true);
    }

}