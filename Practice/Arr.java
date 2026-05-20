package Practice;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Arr extends JPanel{
    public Arr() {

    }
}

@Override
public void paintComponent(Graphics g) {
    //Your custom rendering code here
    try {
        file = new File("friends.txt");
        Scanner s = new Scanner(file);

        w = s.nextInt();
        h = s.nextInt();

        while (s.hasNext() == true) {
            String name = s.nextLine();
            int number = s.nextInt();
            int [] x = new int[number];
            int [] y = new int[number];
            for (int i = 0; i < number; i++) {
                x[i] = s.nextInt();
                y[i] = s.nextInt();
            }
            g.drawPolyline(x, y, number);
        }
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred while reading the file.");
    }
}

public static void main(String[] args) {
    var window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(400,400);
    window.setContentPane(new Arr());
}