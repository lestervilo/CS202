import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
public class MethodExample extends JPanel {
    public MethodExample() {

        happyBirthday("Eve");
        happyBirthday("Balaji");
        happyBirthday("JJ");
}
    public void happy() {
        System.out.println("Happy birthday to you!");
    }
    public void happyBirthday(String birthdayChild) {
        happy();
        happy();
        System.out.println("Happy birthday dear " + birthdayChild + "!");
        happy();
    }

    @Override
    public void paintComponent(Graphics g) {
        //Your custom rendering code here
    }

    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new MethodExample());
        window.setVisible(true);
    }
}