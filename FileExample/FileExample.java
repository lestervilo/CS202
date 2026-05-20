package FileExample;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class FileExample extends JPanel {
	
	public FileExample() {
		//Your custom initialization code here
        String filename = "friends.txt";
        File file = new File(filename);
        System.out.println("Attempting to read the file " + filename);
        ArrayList<String> friends = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            Scanner s = new Scanner(file);
            while (s.hasNext() == true) {
                System.out.println("Reading a name from the file...");
                String name = s.nextLine();
                int number = s.nextInt();
                s.nextLine(); // Consume the newline character after the number
                friends.add(name);
                numbers.add(number);
                System.out.println(name + " is your friend.");
            }
            System.out.println("Finished reading the file.");
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file." + filename);
            System.out.println("Could not find the file " + filename);
        }
        System.out.println("Now let's sort the friends alphabetically.");
        Collections.sort(friends);

        for (String friend : friends) {
            if (friend.equals("Alice")) {
                continue;
            }
            System.out.println(friend + " is your friend.");
        }
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new FileExample());
		window.setVisible(true);
	}
}